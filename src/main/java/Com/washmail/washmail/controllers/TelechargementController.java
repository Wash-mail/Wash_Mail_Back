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

import Com.washmail.washmail.models.Telechargement;
import Com.washmail.washmail.repos.TelechargementRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TelechargementController {
	
	@Autowired
	TelechargementRepository repository;
	
	@GetMapping("/telechargement/get")
	public List<Telechargement> getAll() {

		List<Telechargement> telechargements = new ArrayList<>();
		repository.findAll().forEach(telechargements::add);

		return telechargements;
	}

	@DeleteMapping("/telechargement/delete")
	public ResponseEntity<String> deleteAll() {

		repository.deleteAll();

		return new ResponseEntity<>("Vos Téléchargements ont été supprimé !", HttpStatus.OK);
	}

}
