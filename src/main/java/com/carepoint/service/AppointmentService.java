package com.carepoint.service;
import com.carepoint.model.Appointment;
import com.carepoint.repository.AppointmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@Service
public class AppointmentService {
 private final AppointmentRepository repo;
 public AppointmentService(AppointmentRepository repo) { this.repo=repo; }
 public List<Appointment> all() { return repo.findAll(); }
 public Appointment one(Long id) { return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Appointment not found")); }
 public Appointment create(Appointment item) { item.setId(null); return repo.save(item); }
 public Appointment update(Long id, Appointment item) {
  Appointment old=one(id);
  appointmentCopy(old,item);
  return repo.save(old);
 }
 private void appointmentCopy(Appointment a, Appointment b) {
  a.setPatientId(b.getPatientId());
  a.setPatientName(b.getPatientName());
  a.setDoctorId(b.getDoctorId());
  a.setDoctorName(b.getDoctorName());
  a.setAppointmentDate(b.getAppointmentDate());
  a.setAppointmentTime(b.getAppointmentTime());
  a.setReason(b.getReason());
  a.setStatus(b.getStatus());
 }
 public void delete(Long id) { repo.delete(one(id)); }
}
