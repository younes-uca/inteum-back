package com.ird.faa.dao.impl;

import com.ird.faa.bean.formulaire.Chercheur;
import com.ird.faa.bean.referentiel.Pays;
import com.ird.faa.bean.referentiel.Sexe;
import com.ird.faa.bean.referentiel.Ville;
import com.ird.faa.ws.rest.provided.vo.PaysVo;
import com.ird.faa.ws.rest.provided.vo.SexeVo;
import com.ird.faa.ws.rest.provided.vo.VilleVo;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ChercheurDaoImpl {

    @Autowired
    private EntityManager entityManager;

    public List<Chercheur> getAllChercheurs() {

        Query nativeQuery = entityManager.createNativeQuery(Chercheur.GET_ALL_CHERCHEURS_NATIVE_QUERY);

        List<Object[]> resultList = nativeQuery.getResultList();
        List<Chercheur> result = new ArrayList<>();
        for (Object[] obj : resultList) {
            Chercheur chercheur = new Chercheur();
            chercheur.setId(((BigInteger) (obj[0])).longValue());
            chercheur.setAccountNonExpired((Boolean) obj[1]);
            chercheur.setAccountNonLocked((Boolean) obj[2]);

            Date createdAt = Optional.ofNullable(obj[3]).map(date -> (Timestamp) date)
                    .map(Timestamp::getTime)
                    .map(Date::new).orElse(null);
            chercheur.setCreatedAt(createdAt);

            chercheur.setCredentialsNonExpired((Boolean) obj[4]);
            chercheur.setEmail((String) obj[5]);
            chercheur.setEnabled((Boolean) obj[6]);
            chercheur.setNom((String) obj[7]);
            chercheur.setPassword((String) obj[8]);
            chercheur.setPrenom((String) obj[10]);

            Date updatedAt =
                    Optional.ofNullable(obj[11]).map(date -> (Timestamp) date)
                            .map(Timestamp::getTime)
                            .map(Date::new).orElse(null);
            chercheur.setUpdatedAt(updatedAt);


            chercheur.setUsername((String) obj[12]);
            chercheur.setFormationEnManagement((Boolean) obj[16]);
            chercheur.setNatureImplication((String) obj[17]);
            chercheur.setNumeroMatricule((String) obj[18]);
            chercheur.setResume((String) obj[19]);


            Ville ville = new Ville();
            ville.setLibelle((String) obj[46]);
            chercheur.setVille(ville);

            Pays paysVo = new Pays();
            paysVo.setLibelle((String) obj[47]);
            chercheur.setPays(paysVo);

            Sexe sexeVo = new Sexe();
            sexeVo.setLibelle((String) obj[48]);
            chercheur.setSexe(sexeVo);


            result.add(chercheur);
        }

        return result;
    }

}


