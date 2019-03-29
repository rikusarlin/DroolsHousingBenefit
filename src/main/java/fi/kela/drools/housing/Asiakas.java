package fi.kela.drools.housing;

public class Asiakas {
	long asiakasId;
	AsiakkaanTyyppi asiakkaanTyyppi;
	Henkilo henkiloAsiakas;
	Kieli kieli;
	
	public long getAsiakasId() {
		return asiakasId;
	}
	public void setAsiakasId(long asiakasId) {
		this.asiakasId = asiakasId;
	}
	public AsiakkaanTyyppi getAsiakkaanTyyppi() {
		return asiakkaanTyyppi;
	}
	public void setAsiakkaanTyyppi(AsiakkaanTyyppi asiakkaanTyyppi) {
		this.asiakkaanTyyppi = asiakkaanTyyppi;
	}
	public Henkilo getHenkiloAsiakas() {
		return henkiloAsiakas;
	}
	public void setHenkiloAsiakas(Henkilo henkiloAsiakas) {
		this.henkiloAsiakas = henkiloAsiakas;
	}
	public Kieli getKieli() {
		return kieli;
	}
	public void setKieli(Kieli kieli) {
		this.kieli = kieli;
	}
	
}
