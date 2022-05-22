package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.referentiel.ObjetGlobal;


@Repository
public interface ObjetGlobalDao extends JpaRepository<ObjetGlobal,Long> {




    ObjetGlobal findByCode(String code);

    int deleteByCode(String code);



}
