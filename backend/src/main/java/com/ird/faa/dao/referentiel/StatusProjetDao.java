package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.StatusProjet;


@Repository
public interface StatusProjetDao extends JpaRepository<StatusProjet,Long> {




    StatusProjet findByCode(String code);

    int deleteByCode(String code);



}
