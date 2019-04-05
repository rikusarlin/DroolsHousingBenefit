package fi.kela.drools.general;

import java.util.Date;

public class PerusteTiedot {
	private Date alkuPvm;
	private Date loppuPvm;
	
	public Date getAlkuPvm() {
		return alkuPvm;
	}
	public void setAlkuPvm(Date alkuPvm) {
		this.alkuPvm = alkuPvm;
	}
	public Date getLoppuPvm() {
		return loppuPvm;
	}
	public void setLoppuPvm(Date loppuPvm) {
		this.loppuPvm = loppuPvm;
	}
}
