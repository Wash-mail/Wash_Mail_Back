package Com.washmail.washmail.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.washmail.washmail.models.Historique;
import Com.washmail.washmail.repos.HistoriqueRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class HistoriqueController {
	
	@Autowired
	HistoriqueRepository repository;
	
	@GetMapping("/historique/get")
	public List<Historique> getAll() {

		List<Historique> historiques = new ArrayList<>();
		repository.findAll().forEach(historiques::add);

		return historiques;
	}

	@DeleteMapping("/historique/delete")
	public ResponseEntity<String> deleteAll() {

		repository.deleteAll();

		return new ResponseEntity<>("Votre historique a été supprimé !", HttpStatus.OK);
	}

}
