package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.PubliqueProfessionel;


@Repository
public interface PubliqueProfessionelDao extends JpaRepository<PubliqueProfessionel,Long> {


}
