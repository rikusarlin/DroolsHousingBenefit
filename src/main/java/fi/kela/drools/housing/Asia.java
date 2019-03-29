package fi.kela.drools.housing;

import java.util.Date;

public class Asia {
	long asiaId;
	AsianTila tila;
	Date vireilleTuloPvm;
	Asiakas asiakas;
	Asiakas maksunSaaja;

	public AsianTila getTila() {
		return tila;
	}

	public void setTila(AsianTila tila) {
		this.tila = tila;
	}

	public Date getVireilleTuloPvm() {
		return vireilleTuloPvm;
	}

	public void setVireilleTuloPvm(Date vireilleTuloPvm) {
		this.vireilleTuloPvm = vireilleTuloPvm;
	}

	public Asiakas getAsiakas() {
		return asiakas;
	}

	public void setAsiakas(Asiakas asiakas) {
		this.asiakas = asiakas;
	}

	public Asiakas getMaksunSaaja() {
		return maksunSaaja;
	}

	public void setMaksunSaaja(Asiakas maksunSaaja) {
		this.maksunSaaja = maksunSaaja;
	}

	public long getAsiaId() {
		return asiaId;
	}

	public void setAsiaId(long asiaId) {
		this.asiaId = asiaId;
	}
}
