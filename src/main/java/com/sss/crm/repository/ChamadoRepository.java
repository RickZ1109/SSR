package com.sss.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sss.crm.model.Chamado;

@Repository /* <-- Usada em classes que acessam e manipulam dados, geralmente servindo como um ponto de acesso ao banco de dados.
Esta anotação indica ao Spring que a classe é um componente de persistência e permite a tradução de exceções específicas do banco de dados em exceções mais genéricas do Spring.*/

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
