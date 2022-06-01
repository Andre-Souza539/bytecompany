package br.com.bytecompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bytecompany.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
