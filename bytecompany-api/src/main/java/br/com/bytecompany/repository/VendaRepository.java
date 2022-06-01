package br.com.bytecompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bytecompany.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
