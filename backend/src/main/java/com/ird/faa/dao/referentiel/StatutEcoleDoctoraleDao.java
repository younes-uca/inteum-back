package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.StatutEcoleDoctorale;


@Repository
public interface StatutEcoleDoctoraleDao extends JpaRepository<StatutEcoleDoctorale,Long> {




    StatutEcoleDoctorale findByCode(String code);

    int deleteByCode(String code);



}
