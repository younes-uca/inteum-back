package com.ird.faa.bean.referentiel;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "role_projet")
public class RoleProjet {

    @Id
    @SequenceGenerator(name = "role_projet_seq", sequenceName = "role_projet_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_projet_seq")
    private Long id;

    private String libelle;
    private String code;

    @Column(columnDefinition = "TEXT")
    private String description;


    public RoleProjet() {
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleProjet roleProjet = (RoleProjet) o;
        return id != null && id.equals(roleProjet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

