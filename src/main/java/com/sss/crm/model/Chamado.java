package com.sss.crm.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Chamado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	private String nomeQuemAbriu;
    private LocalDate dataAbertura;
    private String setorAbertura;
    private String descricaoProblema;
	
		
    /*
    	  "nomeQuemAbriu": "Nome Exemplo",
    	  "dataAbertura": "2023-11-13",
    	  "setorAbertura": "Setor Exemplo",
    	  "descricaoProblema": "Descrição Exemplo"
    */



	    
}

