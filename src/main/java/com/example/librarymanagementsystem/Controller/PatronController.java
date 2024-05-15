package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.PatronService;
import com.example.librarymanagementsystem.model.Patron;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

    @Autowired
    private PatronService patronService;

    @GetMapping
    public List<Patron> getAllPatrons() {
        return patronService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patron> getPatronById(@PathVariable Long id) {
        Patron patron = patronService.findById(id).orElseThrow(() -> new RuntimeException("Patron not found"));
        return ResponseEntity.ok(patron);
    }

    @PostMapping
    public Patron createPatron(@Valid @RequestBody Patron patron) {
        return patronService.save(patron);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patron> updatePatron(@PathVariable Long id, @Valid @RequestBody Patron patronDetails) {
        Patron updatedPatron = patronService.update(id, patronDetails);
        return ResponseEntity.ok(updatedPatron);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatron(@PathVariable Long id) {
        patronService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
