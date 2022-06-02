package br.com.bytecompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bytecompany.model.Venda;
import br.com.bytecompany.repository.VendaRepository;

@RestController
@RequestMapping("/faturamento")
public class PegarTotalVendasController {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@GetMapping
	public long calculaFaturamento(){
		
		long qtdVendas = vendaRepository.count();
		
		///
	}

}
