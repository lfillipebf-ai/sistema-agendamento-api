package br.com.luisfillipe.agendamento.controller;
import br.com.luisfillipe.agendamento.model.*;
import br.com.luisfillipe.agendamento.repository.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
@RestController @RequestMapping("/api/appointments")
public class AppointmentController {
 private final AppointmentRepository appointments; private final ClientRepository clients; private final ProfessionalRepository professionals; private final ServiceTypeRepository services;
 public AppointmentController(AppointmentRepository a,ClientRepository c,ProfessionalRepository p,ServiceTypeRepository s){appointments=a;clients=c;professionals=p;services=s;}
 @GetMapping public List<Appointment> all(){return appointments.findAll();}
 @GetMapping("/between") public List<Appointment> between(@RequestParam LocalDateTime start,@RequestParam LocalDateTime end){return appointments.findByScheduledAtBetween(start,end);}
 @PostMapping public Appointment create(@RequestBody AppointmentRequest req){
  Appointment a=new Appointment();
  a.setClient(clients.findById(req.clientId()).orElseThrow());
  a.setProfessional(professionals.findById(req.professionalId()).orElseThrow());
  a.setService(services.findById(req.serviceId()).orElseThrow());
  a.setScheduledAt(req.scheduledAt());
  return appointments.save(a);
 }
 @PatchMapping("/{id}/cancel") public Appointment cancel(@PathVariable Long id){
  Appointment a=appointments.findById(id).orElseThrow(); a.setStatus(AppointmentStatus.CANCELLED); return appointments.save(a);
 }
 public record AppointmentRequest(Long clientId,Long professionalId,Long serviceId,LocalDateTime scheduledAt){}
}
