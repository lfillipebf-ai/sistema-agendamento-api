package br.com.luisfillipe.agendamento.controller;
import br.com.luisfillipe.agendamento.model.Professional;
import br.com.luisfillipe.agendamento.repository.ProfessionalRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/professionals")
public class ProfessionalController {
 private final ProfessionalRepository repo;
 public ProfessionalController(ProfessionalRepository repo){this.repo=repo;}
 @GetMapping public List<Professional> all(){return repo.findAll();}
 @PostMapping public Professional create(@Valid @RequestBody Professional p){return repo.save(p);}
}
