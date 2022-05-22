package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.ObjetFormationGenerique;


@Repository
public interface ObjetFormationGeneriqueDao extends JpaRepository<ObjetFormationGenerique,Long> {




    ObjetFormationGenerique findByCode(String code);

    int deleteByCode(String code);



}
