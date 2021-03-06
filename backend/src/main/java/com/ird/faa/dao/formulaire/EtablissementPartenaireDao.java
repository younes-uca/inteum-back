package com.ird.faa.dao.formulaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.EtablissementPartenaire;


@Repository
public interface EtablissementPartenaireDao extends JpaRepository<EtablissementPartenaire,Long> {




    EtablissementPartenaire findByCode(String code);

    int deleteByCode(String code);



}
