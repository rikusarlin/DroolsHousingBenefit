package fi.kela.drools.general;

import java.util.ArrayList;
import java.util.List;

public class PaatoksenFraasi {
	Fraasi fraasi;
	List<String> muuttujat = new ArrayList<String>();
	
	public PaatoksenFraasi(String fraasiKoodi, Kieli kieli, String... muuttujat) {
		this.setFraasi(Fraasi.haeFraasi(fraasiKoodi, kieli));
		for(String muuttuja:muuttujat) {
			this.muuttujat.add(muuttuja);
		}
	}
	
	public Fraasi getFraasi() {
		return fraasi;
	}
	public void setFraasi(Fraasi fraasi) {
		this.fraasi = fraasi;
	}
	public List<String> getMuuttujat() {
		return muuttujat;
	}
	public void setMuuttujat(List<String> muuttujat) {
		this.muuttujat = muuttujat;
	}
	
	
}
