package br.com.luisfillipe.agendamento.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
@Entity @Table(name="services")
public class ServiceType {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @PositiveOrZero private BigDecimal price;
 private Integer durationMinutes;
 public ServiceType(){}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public BigDecimal getPrice(){return price;} public void setPrice(BigDecimal v){price=v;}
 public Integer getDurationMinutes(){return durationMinutes;} public void setDurationMinutes(Integer v){durationMinutes=v;}
}
