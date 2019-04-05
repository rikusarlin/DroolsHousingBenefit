package fi.kela.drools.general;

public class EtuusAsia extends Asia {
	Etuus etuus;
	Hakemus hakemus;

	public Etuus getEtuus() {
		return etuus;
	}
	public void setEtuus(Etuus etuus) {
		this.etuus = etuus;
	}
	public Hakemus getHakemus() {
		return hakemus;
	}
	public void setHakemus(Hakemus hakemus) {
		this.hakemus = hakemus;
	}
}
