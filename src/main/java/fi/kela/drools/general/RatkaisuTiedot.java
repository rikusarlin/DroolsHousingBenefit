package fi.kela.drools.general;

import java.util.ArrayList;
import java.util.List;

public class RatkaisuTiedot {
	List<PaatoksenFraasi> fraasit = new ArrayList<PaatoksenFraasi>();
	RatkaisuTyyppi ratkaisuTyyppi;
	
	public List<PaatoksenFraasi> getFraasit() {
		return fraasit;
	}

	public void setFraasit(List<PaatoksenFraasi> fraasit) {
		this.fraasit = fraasit;
	}

	public RatkaisuTyyppi getRatkaisuTyyppi() {
		return ratkaisuTyyppi;
	}

	public void setRatkaisuTyyppi(RatkaisuTyyppi ratkaisuTyyppi) {
		this.ratkaisuTyyppi = ratkaisuTyyppi;
	}
	
}
