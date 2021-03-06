package com.ird.faa.bean.formulaire;

import com.ird.faa.bean.config.EtatEtapeCampagne;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "responsabilite_pedagogique_ecole_doctorale")
public class ResponsabilitePedagogiqueEcoleDoctorale {

    @Id
    @SequenceGenerator(name = "responsabilite_pedagogique_ecole_doctorale_seq", sequenceName = "responsabilite_pedagogique_ecole_doctorale_seq",
            allocationSize = 1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "responsabilite_pedagogique_ecole_doctorale_seq")
    private Long id;

    private Integer annee;
    private BigDecimal tempsEstimePourCetteAnnne;
    private Boolean appelServiceRenforcementCapaciteSud;
    private Boolean ecoleDoctoraleInternational;

    @ManyToOne
    private StatutEcoleDoctorale statutEcoleDoctorale;
    @ManyToOne
    private EcoleDoctorale ecoleDoctorale;
    @ManyToOne
    private Etablissement etablissement;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne;
    @ManyToOne
    private Chercheur chercheur;
    @ManyToOne
    private Campagne campagne;


    public ResponsabilitePedagogiqueEcoleDoctorale() {
        super();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnnee() {
        return this.annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public BigDecimal getTempsEstimePourCetteAnnne() {
        return this.tempsEstimePourCetteAnnne;
    }

    public void setTempsEstimePourCetteAnnne(BigDecimal tempsEstimePourCetteAnnne) {
        this.tempsEstimePourCetteAnnne = tempsEstimePourCetteAnnne;
    }

    public StatutEcoleDoctorale getStatutEcoleDoctorale() {
        return this.statutEcoleDoctorale;
    }

    public void setStatutEcoleDoctorale(StatutEcoleDoctorale statutEcoleDoctorale) {
        this.statutEcoleDoctorale = statutEcoleDoctorale;
    }

    public Boolean getAppelServiceRenforcementCapaciteSud() {
        return this.appelServiceRenforcementCapaciteSud;
    }

    public void setAppelServiceRenforcementCapaciteSud(Boolean appelServiceRenforcementCapaciteSud) {
        this.appelServiceRenforcementCapaciteSud = appelServiceRenforcementCapaciteSud;
    }

    public Boolean getEcoleDoctoraleInternational() {
        return this.ecoleDoctoraleInternational;
    }

    public void setEcoleDoctoraleInternational(Boolean ecoleDoctoraleInternational) {
        this.ecoleDoctoraleInternational = ecoleDoctoraleInternational;
    }

    public EcoleDoctorale getEcoleDoctorale() {
        return this.ecoleDoctorale;
    }

    public void setEcoleDoctorale(EcoleDoctorale ecoleDoctorale) {
        this.ecoleDoctorale = ecoleDoctorale;
    }

    public Etablissement getEtablissement() {
        return this.etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public EtatEtapeCampagne getEtatEtapeCampagne() {
        return this.etatEtapeCampagne;
    }

    public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne) {
        this.etatEtapeCampagne = etatEtapeCampagne;
    }

    public Chercheur getChercheur() {
        return this.chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Campagne getCampagne() {
        return this.campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsabilitePedagogiqueEcoleDoctorale responsabilitePedagogiqueEcoleDoctorale = (ResponsabilitePedagogiqueEcoleDoctorale) o;
        return id != null && id.equals(responsabilitePedagogiqueEcoleDoctorale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

