package com.sss.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sss.crm.model.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
