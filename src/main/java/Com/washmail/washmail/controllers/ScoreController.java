package Com.washmail.washmail.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.washmail.washmail.models.Score;
import Com.washmail.washmail.repos.ScoreRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ScoreController {
	
	@Autowired
	ScoreRepository repository;
	
	@GetMapping("/score/get")
	public List<Score> getAll() {

		List<Score> scores = new ArrayList<>();
		repository.findAll().forEach(scores::add);

		return scores;
	}
	
	@PutMapping("/score/put/{nombre}")
	public ResponseEntity<String>replaceScore(@PathVariable ("nombre") int nombre) {
		Score score = new Score(1, nombre);
 
		repository.save(score);
		
		return new ResponseEntity<>("Changement du score !", HttpStatus.OK);
		
	}

	@DeleteMapping("/score/delete")
	public ResponseEntity<String> deleteAll() {

		repository.deleteAll();

		return new ResponseEntity<>("Score remis à 0 !", HttpStatus.OK);
	}

}
