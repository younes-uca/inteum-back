package com.ird.faa.dao.referentiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ird.faa.bean.formulaire.TypeUtilisateur;

@Repository
public interface TypeUtilisateurDao extends JpaRepository<TypeUtilisateur, Long> {

	TypeUtilisateur findByCode(String code);

	int deleteByCode(String code);

}
