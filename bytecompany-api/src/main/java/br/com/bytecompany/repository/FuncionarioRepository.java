package br.com.bytecompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bytecompany.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,  Long> {
	
}
