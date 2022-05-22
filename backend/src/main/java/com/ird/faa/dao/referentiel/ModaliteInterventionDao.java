package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.ModaliteIntervention;

@Repository
public interface ModaliteInterventionDao extends JpaRepository<ModaliteIntervention, Long> {

	ModaliteIntervention findByCode(String code);

	int deleteByCode(String code);

}
