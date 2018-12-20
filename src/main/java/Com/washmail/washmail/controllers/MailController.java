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

import Com.washmail.washmail.models.Mail;
import Com.washmail.washmail.repos.MailRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MailController {
	
	@Autowired
	MailRepository repository;

	@GetMapping("/mail/getall")
	public List<Mail> getAll() {

		List<Mail> mails = new ArrayList<>();
		repository.findAll().forEach(mails::add);

		return mails;
	}

	

	@DeleteMapping("/mail/deleteall")
	public ResponseEntity<String> deleteAll() {

		repository.deleteAll();

		return new ResponseEntity<>("Toutes vos mails ont été supprimé !", HttpStatus.OK);
	}
	
	@DeleteMapping("/mail/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		
		repository.deleteById(id);		 

		return new ResponseEntity<>("Mail supprimé !", HttpStatus.OK);
	}

}
