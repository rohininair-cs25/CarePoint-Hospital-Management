package com.carepoint.controller;
import com.carepoint.model.Patient;
import com.carepoint.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/patients")
public class PatientController {
 private final PatientService service;
 public PatientController(PatientService service) { this.service=service; }
 @GetMapping public List<Patient> all() { return service.all(); }
 @GetMapping("/{id}") public Patient one(@PathVariable Long id) { return service.one(id); }
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Patient create(@RequestBody Patient item) { return service.create(item); }
 @PutMapping("/{id}") public Patient update(@PathVariable Long id,@RequestBody Patient item) { return service.update(id,item); }
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id) { service.delete(id); }
}
