package com.ird.faa.ws.rest.provided.vo;

import java.util.List;

public class CampagneVo {

	private String id;
	private String libelle;
	private String code;
	private String annee;
	private String dateDepart;
	private String dateFin;
	private String objetOuverture;
	private String messageOuverture;
	private String objetCloture;
	private String messageCloture;
	private EtatCampagneVo etatCampagneVo;
	private TemplateOuvertureVo templateOuvertureVo;
	private TemplateClotureVo templateClotureVo;
	private List<CampagneChercheurOuvertureVo> campagneChercheurOuverturesVo;
	private List<CampagneChercheurFermetureVo> campagneChercheurFermeturesVo;
	private List<CampagneRelanceVo> campagneRelancesVo;
	private List<CampagneRappelVo> campagneRappelsVo;
	private List<DistinctionVo> distinctionsVo;
	private List<ProjetActiviteRechercheVo> projetActiviteRecherchesVo;
	private List<InstrumentsEtDispositifsIrdVo> instrumentsEtDispositifsIrdsVo;
	private List<GestionEquipeVo> gestionEquipesVo;
	private List<ResponsabilitePedagogiqueEcoleDoctoraleVo> responsabilitePedagogiqueEcoleDoctoralesVo;
	private List<ResponsabilitePedagogiqueMasterVo> responsabilitePedagogiqueMastersVo;
	private List<ExpertiseScientifiqueVo> expertiseScientifiquesVo;
	private List<EvaluationRechercheUniversitaireVo> evaluationRechercheUniversitairesVo;
	private List<SavoirEtInnovationVo> savoirEtInnovationsVo;
    private List<CultureScientifiqueVo> cultureScientifiquesVo; 
    private List<VieInstitutionnelleVo> vieInstitutionnellesVo;
    private List<EncadrementVo> encadrementsVo;
	public CampagneVo() {
		super();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public String getAnnee() {
		return this.annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getObjetOuverture() {
		return this.objetOuverture;
	}

	public void setObjetOuverture(String objetOuverture) {
		this.objetOuverture = objetOuverture;
	}

	public String getMessageOuverture() {
		return this.messageOuverture;
	}

	public void setMessageOuverture(String messageOuverture) {
		this.messageOuverture = messageOuverture;
	}

	public String getObjetCloture() {
		return this.objetCloture;
	}

	public void setObjetCloture(String objetCloture) {
		this.objetCloture = objetCloture;
	}

	public String getMessageCloture() {
		return this.messageCloture;
	}

	public void setMessageCloture(String messageCloture) {
		this.messageCloture = messageCloture;
	}

	
	
	public EtatCampagneVo getEtatCampagneVo() {
		return this.etatCampagneVo;
	}

	public void setEtatCampagneVo(EtatCampagneVo etatCampagneVo) {
		this.etatCampagneVo = etatCampagneVo;
	}

	public TemplateOuvertureVo getTemplateOuvertureVo() {
		return this.templateOuvertureVo;
	}

	public void setTemplateOuvertureVo(TemplateOuvertureVo templateOuvertureVo) {
		this.templateOuvertureVo = templateOuvertureVo;
	}

	public TemplateClotureVo getTemplateClotureVo() {
		return this.templateClotureVo;
	}

	public void setTemplateClotureVo(TemplateClotureVo templateClotureVo) {
		this.templateClotureVo = templateClotureVo;
	}

	public List<CampagneChercheurOuvertureVo> getCampagneChercheurOuverturesVo() {
		return this.campagneChercheurOuverturesVo;
	}

	public void setCampagneChercheurOuverturesVo(List<CampagneChercheurOuvertureVo> campagneChercheurOuverturesVo) {
		this.campagneChercheurOuverturesVo = campagneChercheurOuverturesVo;
	}

	public List<CampagneChercheurFermetureVo> getCampagneChercheurFermeturesVo() {
		return this.campagneChercheurFermeturesVo;
	}

	public void setCampagneChercheurFermeturesVo(List<CampagneChercheurFermetureVo> campagneChercheurFermeturesVo) {
		this.campagneChercheurFermeturesVo = campagneChercheurFermeturesVo;
	}

	public List<CampagneRelanceVo> getCampagneRelancesVo() {
		return this.campagneRelancesVo;
	}

	public void setCampagneRelancesVo(List<CampagneRelanceVo> campagneRelancesVo) {
		this.campagneRelancesVo = campagneRelancesVo;
	}

	public List<CampagneRappelVo> getCampagneRappelsVo() {
		return this.campagneRappelsVo;
	}

	public void setCampagneRappelsVo(List<CampagneRappelVo> campagneRappelsVo) {
		this.campagneRappelsVo = campagneRappelsVo;
	}

	public List<DistinctionVo> getDistinctionsVo() {
		return this.distinctionsVo;
	}

	public void setDistinctionsVo(List<DistinctionVo> distinctionsVo) {
		this.distinctionsVo = distinctionsVo;
	}

	public List<ProjetActiviteRechercheVo> getProjetActiviteRecherchesVo() {
		return this.projetActiviteRecherchesVo;
	}

	public void setProjetActiviteRecherchesVo(List<ProjetActiviteRechercheVo> projetActiviteRecherchesVo) {
		this.projetActiviteRecherchesVo = projetActiviteRecherchesVo;
	}

	public List<InstrumentsEtDispositifsIrdVo> getInstrumentsEtDispositifsIrdsVo() {
		return this.instrumentsEtDispositifsIrdsVo;
	}

	public void setInstrumentsEtDispositifsIrdsVo(List<InstrumentsEtDispositifsIrdVo> instrumentsEtDispositifsIrdsVo) {
		this.instrumentsEtDispositifsIrdsVo = instrumentsEtDispositifsIrdsVo;
	}

	public List<GestionEquipeVo> getGestionEquipesVo() {
		return this.gestionEquipesVo;
	}

	public void setGestionEquipesVo(List<GestionEquipeVo> gestionEquipesVo) {
		this.gestionEquipesVo = gestionEquipesVo;
	}

	
	
	
	
	public List<ResponsabilitePedagogiqueEcoleDoctoraleVo> getResponsabilitePedagogiqueEcoleDoctoralesVo() {
		return this.responsabilitePedagogiqueEcoleDoctoralesVo;
	}

	public void setResponsabilitePedagogiqueEcoleDoctoralesVo(
			List<ResponsabilitePedagogiqueEcoleDoctoraleVo> responsabilitePedagogiqueEcoleDoctoralesVo) {
		this.responsabilitePedagogiqueEcoleDoctoralesVo = responsabilitePedagogiqueEcoleDoctoralesVo;
	}

	public List<ResponsabilitePedagogiqueMasterVo> getResponsabilitePedagogiqueMastersVo() {
		return this.responsabilitePedagogiqueMastersVo;
	}

	public void setResponsabilitePedagogiqueMastersVo(
			List<ResponsabilitePedagogiqueMasterVo> responsabilitePedagogiqueMastersVo) {
		this.responsabilitePedagogiqueMastersVo = responsabilitePedagogiqueMastersVo;
	}

	public List<ExpertiseScientifiqueVo> getExpertiseScientifiquesVo() {
		return this.expertiseScientifiquesVo;
	}

	public void setExpertiseScientifiquesVo(List<ExpertiseScientifiqueVo> expertiseScientifiquesVo) {
		this.expertiseScientifiquesVo = expertiseScientifiquesVo;
	}

	public List<EvaluationRechercheUniversitaireVo> getEvaluationRechercheUniversitairesVo() {
		return this.evaluationRechercheUniversitairesVo;
	}

	public void setEvaluationRechercheUniversitairesVo(
			List<EvaluationRechercheUniversitaireVo> evaluationRechercheUniversitairesVo) {
		this.evaluationRechercheUniversitairesVo = evaluationRechercheUniversitairesVo;
	}

		public List<VieInstitutionnelleVo> getVieInstitutionnellesVo() {
		return this.vieInstitutionnellesVo;
	}

	public void setVieInstitutionnellesVo(List<VieInstitutionnelleVo> vieInstitutionnellesVo) {
		this.vieInstitutionnellesVo = vieInstitutionnellesVo;
	}

	public List<SavoirEtInnovationVo> getSavoirEtInnovationsVo() {
		return savoirEtInnovationsVo;
	}

	public void setSavoirEtInnovationsVo(List<SavoirEtInnovationVo> savoirEtInnovationsVo) {
		this.savoirEtInnovationsVo = savoirEtInnovationsVo;
	}

	public List<CultureScientifiqueVo> getCultureScientifiquesVo() {
		return cultureScientifiquesVo;
	}

	public List<EncadrementVo> getEncadrementsVo() {
		return encadrementsVo;
	}

	public void setEncadrementsVo(List<EncadrementVo> encadrementsVo) {
		this.encadrementsVo = encadrementsVo;
	}

	public void setCultureScientifiquesVo(List<CultureScientifiqueVo> cultureScientifiquesVo) {
		this.cultureScientifiquesVo = cultureScientifiquesVo;
	}

}
