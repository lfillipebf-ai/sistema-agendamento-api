package br.com.luisfillipe.agendamento.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity @Table(name="professionals")
public class Professional {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @NotBlank private String specialty;
 public Professional(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getSpecialty(){return specialty;} public void setSpecialty(String v){specialty=v;}
}
