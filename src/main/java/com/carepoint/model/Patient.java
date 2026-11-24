package com.carepoint.model;
import jakarta.persistence.*;
@Entity @Table(name="patients")
public class Patient {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private Integer age; private String gender; private String phone; private String email; private String bloodGroup; private String address;
 public Patient(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
 public Integer getAge(){return age;} public void setAge(Integer v){age=v;}
 public String getGender(){return gender;} public void setGender(String v){gender=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getBloodGroup(){return bloodGroup;} public void setBloodGroup(String v){bloodGroup=v;}
 public String getAddress(){return address;} public void setAddress(String v){address=v;}
}
