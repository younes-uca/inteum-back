package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ird.faa.bean.referentiel.Partenaire;

public interface PartenaireDao extends JpaRepository<Partenaire, Long> {
	
	Partenaire findByIdGraphQl(String code);

    int deleteByIdGraphQl(String code);
}
