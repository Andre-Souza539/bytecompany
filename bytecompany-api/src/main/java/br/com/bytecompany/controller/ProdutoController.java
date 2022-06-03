package br.com.bytecompany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytecompany.model.Produto;
import br.com.bytecompany.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listar(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produtos/{id}")
	public Optional<Produto> listarUnico(@PathVariable Long id){
		return produtoRepository.findById(id);
	}

	@DeleteMapping("/produtos/{id}")
	public void removerProduto(@PathVariable Long id){
		produtoRepository.deleteById(id);
	}
	
	@PostMapping("/produtos")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
