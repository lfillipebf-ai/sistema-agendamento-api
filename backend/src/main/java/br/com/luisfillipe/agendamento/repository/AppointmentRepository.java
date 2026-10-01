package br.com.luisfillipe.agendamento.repository;
import br.com.luisfillipe.agendamento.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{
 List<Appointment> findByScheduledAtBetween(LocalDateTime start,LocalDateTime end);
}
