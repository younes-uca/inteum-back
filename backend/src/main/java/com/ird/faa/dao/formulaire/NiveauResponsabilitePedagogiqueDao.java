package com.ird.faa.dao.formulaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.NiveauResponsabilitePedagogique;


@Repository
public interface NiveauResponsabilitePedagogiqueDao extends JpaRepository<NiveauResponsabilitePedagogique,Long> {

    NiveauResponsabilitePedagogique findByCode(String code);

    int deleteByCode(String code);



}
