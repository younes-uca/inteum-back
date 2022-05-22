package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.PubliquePrincipal;


@Repository
public interface PubliquePrincipalDao extends JpaRepository<PubliquePrincipal,Long> {







}
