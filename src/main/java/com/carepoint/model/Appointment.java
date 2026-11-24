package com.carepoint.model;
import jakarta.persistence.*;
@Entity @Table(name="appointments")
public class Appointment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long patientId; private String patientName; private Long doctorId; private String doctorName;
 private String appointmentDate; private String appointmentTime; private String reason; private String status;
 public Appointment(){}
 public Long getId(){return id;} public void setId(Long v){id=v;}
 public Long getPatientId(){return patientId;} public void setPatientId(Long v){patientId=v;}
 public String getPatientName(){return patientName;} public void setPatientName(String v){patientName=v;}
 public Long getDoctorId(){return doctorId;} public void setDoctorId(Long v){doctorId=v;}
 public String getDoctorName(){return doctorName;} public void setDoctorName(String v){doctorName=v;}
 public String getAppointmentDate(){return appointmentDate;} public void setAppointmentDate(String v){appointmentDate=v;}
 public String getAppointmentTime(){return appointmentTime;} public void setAppointmentTime(String v){appointmentTime=v;}
 public String getReason(){return reason;} public void setReason(String v){reason=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
