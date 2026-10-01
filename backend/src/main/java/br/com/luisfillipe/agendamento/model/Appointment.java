package br.com.luisfillipe.agendamento.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity @Table(name="appointments")
public class Appointment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Client client;
 @ManyToOne(optional=false) private Professional professional;
 @ManyToOne(optional=false) private ServiceType service;
 private LocalDateTime scheduledAt;
 @Enumerated(EnumType.STRING) private AppointmentStatus status=AppointmentStatus.SCHEDULED;
 public Long getId(){return id;} public Client getClient(){return client;} public void setClient(Client v){client=v;}
 public Professional getProfessional(){return professional;} public void setProfessional(Professional v){professional=v;}
 public ServiceType getService(){return service;} public void setService(ServiceType v){service=v;}
 public LocalDateTime getScheduledAt(){return scheduledAt;} public void setScheduledAt(LocalDateTime v){scheduledAt=v;}
 public AppointmentStatus getStatus(){return status;} public void setStatus(AppointmentStatus v){status=v;}
}
