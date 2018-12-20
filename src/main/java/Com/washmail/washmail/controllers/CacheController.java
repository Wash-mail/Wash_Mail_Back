package Com.washmail.washmail.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Com.washmail.washmail.models.Cache;
import Com.washmail.washmail.repos.CacheRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CacheController {

    @Autowired
    CacheRepository repository;

    @GetMapping("/cache/get")
    public List<Cache> getAll() {

        List<Cache> caches = new ArrayList<>();
        repository.findAll().forEach(caches::add);

        return caches;
    }

    @DeleteMapping("/cache/delete")
    public ResponseEntity<String> deleteAll() {

        repository.deleteAll();

        return new ResponseEntity<>("Votre cache a été supprimé !", HttpStatus.OK);
    }
}
