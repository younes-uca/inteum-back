package com.ird.faa.bean.referentiel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "modalite")
public class Modalite {

    @Id
    @SequenceGenerator(name = "modalite_seq", sequenceName = "modalite_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "modalite_seq")
    private Long id;

    private String libelle;
    private String code;


    public Modalite() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modalite modalite = (Modalite) o;
        return id != null && id.equals(modalite.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

