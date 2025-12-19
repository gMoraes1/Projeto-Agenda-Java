package com.gustavo.agenda.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gustavo.agenda.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer>{
    
}
