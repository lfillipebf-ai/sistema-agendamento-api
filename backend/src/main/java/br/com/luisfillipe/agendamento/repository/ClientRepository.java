package br.com.luisfillipe.agendamento.repository;
import br.com.luisfillipe.agendamento.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Client,Long>{}
