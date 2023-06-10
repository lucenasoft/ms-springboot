package br.com.lucenasoft.hrworker.controllers;

import br.com.lucenasoft.hrworker.models.Worker;
import br.com.lucenasoft.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
        Optional<Worker> worker = repository.findById(id);
        return ResponseEntity.ok(worker);
    }

}
