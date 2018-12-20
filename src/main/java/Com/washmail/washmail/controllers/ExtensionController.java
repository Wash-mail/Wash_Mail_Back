package Com.washmail.washmail.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.washmail.washmail.models.Extension;
import Com.washmail.washmail.repos.ExtensionRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ExtensionController {
	
	@Autowired
	ExtensionRepository repository;
	
	@GetMapping("/extension/getall")
	public List<Extension> getAll() {

		List<Extension> extensions = new ArrayList<>();
		repository.findAll().forEach(extensions::add);

		return extensions;
	}

	

	@DeleteMapping("/extension/deleteall")
	public ResponseEntity<String> deleteAll() {

		repository.deleteAll();

		return new ResponseEntity<>("Toutes vos extensions ont été supprimé !", HttpStatus.OK);
	}
	
	@DeleteMapping("/extension/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		
		repository.deleteById(id);		 

		return new ResponseEntity<>("Extension supprimée !", HttpStatus.OK);
	}



}
