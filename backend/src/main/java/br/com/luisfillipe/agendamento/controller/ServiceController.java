package br.com.luisfillipe.agendamento.controller;
import br.com.luisfillipe.agendamento.model.ServiceType;
import br.com.luisfillipe.agendamento.repository.ServiceTypeRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/services")
public class ServiceController {
 private final ServiceTypeRepository repo;
 public ServiceController(ServiceTypeRepository repo){this.repo=repo;}
 @GetMapping public List<ServiceType> all(){return repo.findAll();}
 @PostMapping public ServiceType create(@Valid @RequestBody ServiceType s){return repo.save(s);}
}
