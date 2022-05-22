package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.TypeEntiteAdministrative;


@Repository
public interface TypeEntiteAdministrativeDao extends JpaRepository<TypeEntiteAdministrative,Long> {




    TypeEntiteAdministrative findByCode(String code);

    int deleteByCode(String code);



}
