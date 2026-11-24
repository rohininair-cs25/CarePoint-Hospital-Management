package com.carepoint.service;
import com.carepoint.model.Doctor;
import com.carepoint.repository.DoctorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@Service
public class DoctorService {
 private final DoctorRepository repo;
 public DoctorService(DoctorRepository repo) { this.repo=repo; }
 public List<Doctor> all() { return repo.findAll(); }
 public Doctor one(Long id) { return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not found")); }
 public Doctor create(Doctor item) { item.setId(null); return repo.save(item); }
 public Doctor update(Long id, Doctor item) {
  Doctor old=one(id);
  doctorCopy(old,item);
  return repo.save(old);
 }
 private void doctorCopy(Doctor a, Doctor b) {
  a.setName(b.getName());
  a.setSpecialization(b.getSpecialization());
  a.setPhone(b.getPhone());
  a.setEmail(b.getEmail());
  a.setAvailability(b.getAvailability());
 }
 public void delete(Long id) { repo.delete(one(id)); }
}
