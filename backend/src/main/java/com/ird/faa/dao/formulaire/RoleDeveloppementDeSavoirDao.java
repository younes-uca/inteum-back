package com.ird.faa.dao.formulaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.RoleDeveloppementDeSavoir;

@Repository
public interface RoleDeveloppementDeSavoirDao extends JpaRepository<RoleDeveloppementDeSavoir, Long> {

	RoleDeveloppementDeSavoir findByCode(String code);

	int deleteByCode(String code);

}
