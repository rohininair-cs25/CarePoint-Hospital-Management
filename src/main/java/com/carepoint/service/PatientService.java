package com.carepoint.service;
import com.carepoint.model.Patient;
import com.carepoint.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@Service
public class PatientService {
 private final PatientRepository repo;
 public PatientService(PatientRepository repo) { this.repo=repo; }
 public List<Patient> all() { return repo.findAll(); }
 public Patient one(Long id) { return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient not found")); }
 public Patient create(Patient item) { item.setId(null); return repo.save(item); }
 public Patient update(Long id, Patient item) {
  Patient old=one(id);
  patientCopy(old,item);
  return repo.save(old);
 }
 private void patientCopy(Patient a, Patient b) {
  a.setName(b.getName());
  a.setAge(b.getAge());
  a.setGender(b.getGender());
  a.setPhone(b.getPhone());
  a.setEmail(b.getEmail());
  a.setBloodGroup(b.getBloodGroup());
  a.setAddress(b.getAddress());
 }
 public void delete(Long id) { repo.delete(one(id)); }
}
