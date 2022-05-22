package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.TypeEnseignementDispense;


@Repository
public interface TypeEnseignementDispenseDao extends JpaRepository<TypeEnseignementDispense,Long> {




    TypeEnseignementDispense findByCode(String code);

    int deleteByCode(String code);



}
