package com.carepoint.controller;
import com.carepoint.model.Doctor;
import com.carepoint.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/doctors")
public class DoctorController {
 private final DoctorService service;
 public DoctorController(DoctorService service) { this.service=service; }
 @GetMapping public List<Doctor> all() { return service.all(); }
 @GetMapping("/{id}") public Doctor one(@PathVariable Long id) { return service.one(id); }
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Doctor create(@RequestBody Doctor item) { return service.create(item); }
 @PutMapping("/{id}") public Doctor update(@PathVariable Long id,@RequestBody Doctor item) { return service.update(id,item); }
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id) { service.delete(id); }
}
