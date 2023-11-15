package com.sss.crm.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data /* <-- Lombok que gera automaticamente métodos como equals(), hashCode(), toString(), getters e setters, reduzindo a necessidade de escrever código boilerplate em classes Java.*/

@Entity /* <-- Indica que ela é uma entidade JPA (Java Persistence API),
representando uma tabela em um banco de dados relacional. Essa anotação é frequentemente usada em conjunto com o framework Spring Data JPA para persistência de dados.*/
public class Chamado {

@Id /* <-- Usada em um campo de uma classe marcada como @Entity para indicar que esse campo é a chave primária da tabela correspondente no banco de dados relacional.
Identifica exclusivamente uma instância da entidade.*/

@GeneratedValue(strategy = GenerationType.IDENTITY) /* <-- Indica que o valor da chave primária (ID) deve ser gerado automaticamente pelo sistema,
geralmente usando uma estratégia específica, como incremento automático. Isso é comumente usado para chaves primárias de bancos de dados.*/

private Long id;
	 
private String nomeQuemAbriu;
private LocalDate dataAbertura;
private String setorAbertura;
private String descricaoProblema;
	
		
/*
     Modelo para funcionamento Postman
     
     "nomeQuemAbriu": "Nome Exemplo",
     "dataAbertura": "2023-11-13",
     "setorAbertura": "Setor Exemplo",
     "descricaoProblema": "Descrição Exemplo"
     
 */



	    
}

