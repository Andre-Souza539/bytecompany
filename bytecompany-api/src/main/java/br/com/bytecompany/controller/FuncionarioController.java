package br.com.bytecompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytecompany.model.Funcionario;
import br.com.bytecompany.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping
	public List<Funcionario> listar(){
		return funcionarioRepository.findAll(); 
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Funcionario adicionar(@RequestBody Funcionario funcionario) {
			return funcionarioRepository.save(funcionario);
	}
	
	
	
}
