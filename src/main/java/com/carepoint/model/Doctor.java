package com.carepoint.model;
import jakarta.persistence.*;
@Entity @Table(name="doctors")
public class Doctor {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private String specialization; private String phone; private String email; private String availability;
 public Doctor(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
 public String getSpecialization(){return specialization;} public void setSpecialization(String v){specialization=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getAvailability(){return availability;} public void setAvailability(String v){availability=v;}
}
