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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytecompany.model.Venda;
import br.com.bytecompany.repository.VendaRepository;

@RestController
public class VendaController {

	@Autowired
	private VendaRepository vendaRepository;
	
	@GetMapping("/vendas")
	public List<Venda> listar(){
		return vendaRepository.findAll();
	}
	
	@GetMapping("/vendas/{id}")
	public Optional<Venda> getVendaEspecifica(@PathVariable Long id) {
		return vendaRepository.findById(id);
	}
	
	
	@PostMapping("/vendas")
	@ResponseStatus(HttpStatus.CREATED)
	public Venda adicionar(@RequestBody Venda venda){
		return vendaRepository.save(venda);
	}
	
	@DeleteMapping("/vendas/{id}")
	public void remover(@PathVariable Long id) {
		vendaRepository.deleteById(id);
	}
}
