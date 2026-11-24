package com.carepoint.controller;
import com.carepoint.model.Appointment;
import com.carepoint.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/appointments")
public class AppointmentController {
 private final AppointmentService service;
 public AppointmentController(AppointmentService service) { this.service=service; }
 @GetMapping public List<Appointment> all() { return service.all(); }
 @GetMapping("/{id}") public Appointment one(@PathVariable Long id) { return service.one(id); }
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Appointment create(@RequestBody Appointment item) { return service.create(item); }
 @PutMapping("/{id}") public Appointment update(@PathVariable Long id,@RequestBody Appointment item) { return service.update(id,item); }
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id) { service.delete(id); }
}
