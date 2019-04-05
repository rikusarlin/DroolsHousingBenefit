package fi.kela.drools.general;

public class AsiakirjaSuhde {
	AsiakirjanSuhdeTyyppi suhdeTyyppi;
	Asiakirja lahdeAsiakirja;
	Asiakirja kohdeAsiakirja;
	public AsiakirjanSuhdeTyyppi getSuhdeTyyppi() {
		return suhdeTyyppi;
	}
	public void setSuhdeTyyppi(AsiakirjanSuhdeTyyppi suhdeTyyppi) {
		this.suhdeTyyppi = suhdeTyyppi;
	}
	public Asiakirja getLahdeAsiakirja() {
		return lahdeAsiakirja;
	}
	public void setLahdeAsiakirja(Asiakirja lahdeAsiakirja) {
		this.lahdeAsiakirja = lahdeAsiakirja;
	}
	public Asiakirja getKohdeAsiakirja() {
		return kohdeAsiakirja;
	}
	public void setKohdeAsiakirja(Asiakirja kohdeAsiakirja) {
		this.kohdeAsiakirja = kohdeAsiakirja;
	}
}
