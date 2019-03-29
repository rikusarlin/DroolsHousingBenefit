package fi.kela.drools.housing;

import java.util.ArrayList;
import java.util.List;

public class EtuusAsia extends Asia {
	Etuus etuus;
	RatkaisuTiedot ratkaisuTiedot;
	Hakemus hakemus;
	PerusteTiedot perusteTiedot;
	List<Liite> liitteet = new ArrayList<Liite>();

	public Etuus getEtuus() {
		return etuus;
	}
	public void setEtuus(Etuus etuus) {
		this.etuus = etuus;
	}
	public RatkaisuTiedot getRatkaisuTiedot() {
		return ratkaisuTiedot;
	}
	public void setRatkaisuTiedot(RatkaisuTiedot ratkaisuTiedot) {
		this.ratkaisuTiedot = ratkaisuTiedot;
	}
	public Hakemus getHakemus() {
		return hakemus;
	}
	public void setHakemus(Hakemus hakemus) {
		this.hakemus = hakemus;
	}
	public List<Liite> getLiitteet() {
		return liitteet;
	}
	public void setLiitteet(List<Liite> liitteet) {
		this.liitteet = liitteet;
	}
	public PerusteTiedot getPerusteTiedot() {
		return perusteTiedot;
	}
	public void setPerusteTiedot(PerusteTiedot perusteTiedot) {
		this.perusteTiedot = perusteTiedot;
	}}
