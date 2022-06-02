package br.com.bytecompany.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/vendas")
public class VendaController {

	@Autowired
	private VendaRepository vendaRepository;
	
	@GetMapping
	public List<Venda> listar(){
		return vendaRepository.findAll();
	}
	
	@GetMapping("/vendas/{id}")
	public Venda getVendaEspecifica(@PathVariable Long id) {
		return vendaRepository.getById(id);
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Venda adicionar(@RequestBody Venda venda){
		return vendaRepository.save(venda);
	}
}
