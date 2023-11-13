package com.sss.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sss.crm.model.Chamado;
import com.sss.crm.repository.ChamadoRepository;

@RestController
@RequestMapping("/Chamado")
public class sssControler {
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	@GetMapping
	public List<Chamado> listar() {
		return chamadoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Chamado adicionar (@RequestBody Chamado chamado) {
		return chamadoRepository.save(chamado);
	}
}


