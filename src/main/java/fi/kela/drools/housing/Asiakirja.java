package fi.kela.drools.housing;

public class Asiakirja {
	long asiakirjaId;
	String asiakirjaTunniste;
	String otsikko;
	String asiakirjanTyyppi; // TOS:ista 
	String tehtavaLuokka; // TOS:ista
	public long getAsiakirjaId() {
		return asiakirjaId;
	}
	public void setAsiakirjaId(long asiakirjaId) {
		this.asiakirjaId = asiakirjaId;
	}
	public String getAsiakirjaTunniste() {
		return asiakirjaTunniste;
	}
	public void setAsiakirjaTunniste(String asiakirjaTunniste) {
		this.asiakirjaTunniste = asiakirjaTunniste;
	}
	public String getOtsikko() {
		return otsikko;
	}
	public void setOtsikko(String otsikko) {
		this.otsikko = otsikko;
	}
	public String getAsiakirjanTyyppi() {
		return asiakirjanTyyppi;
	}
	public void setAsiakirjanTyyppi(String asiakirjanTyyppi) {
		this.asiakirjanTyyppi = asiakirjanTyyppi;
	}
	public String getTehtavaLuokka() {
		return tehtavaLuokka;
	}
	public void setTehtavaLuokka(String tehtavaLuokka) {
		this.tehtavaLuokka = tehtavaLuokka;
	}
}
