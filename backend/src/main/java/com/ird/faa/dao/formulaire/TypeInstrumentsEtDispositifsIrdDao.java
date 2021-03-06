package com.ird.faa.dao.formulaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ird.faa.bean.formulaire.TypeInstrumentsEtDispositifsIrd;


@Repository
public interface TypeInstrumentsEtDispositifsIrdDao extends JpaRepository<TypeInstrumentsEtDispositifsIrd,Long> {




    TypeInstrumentsEtDispositifsIrd findByCode(String code);

    int deleteByCode(String code);



}
