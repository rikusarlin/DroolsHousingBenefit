package fi.kela.drools.housing;

import java.util.HashMap;
import java.util.Map;

public class Fraasi {
	String fraasiKoodi;
	Kieli kieli;
	String fraasiTeksti;
	int muuttujienMaara=0;
	
	private static Map<String, Fraasi> fraasit = new HashMap<String, Fraasi>();

	static {
		fraasit.put("AY001FI", new Fraasi("AY001", Kieli.SUOMI, 1, "Vammaiskorotuksen jälkeinen ruokakunnan koko $1, koska ruokakunnassa on jäsen/jäseniä, joka tarvitsee/tarvitsevat lisätilaa"));
		fraasit.put("AY002FI", new Fraasi("AY002", Kieli.SUOMI, 2, "Ruokakunnan laskennallinen koko on $1, jäsenet: $2"));
		fraasit.put("AY003FI", new Fraasi("AY003", Kieli.SUOMI, 4, "Asuinkunta $1 on kalleusryhmän $2 kunta. $3 hengen ruokakunnan enimmäisasumismenot ovat $4 euroa."));
		fraasit.put("AY004FI", new Fraasi("AY004", Kieli.SUOMI, 1, "Asunnon lämmityskustannuksina hyväksytään $1 euroa."));
		fraasit.put("AY005FI", new Fraasi("AY005", Kieli.SUOMI, 2, "Hoito/lämmitysmenoja nostettu $1 prosenttia, koska maakunta on $2."));
		fraasit.put("AY006FI", new Fraasi("AY006", Kieli.SUOMI, 2, "Muu omistusasunnon hoitomenona hyväksytty $1 euroa ennen rajausta suhteessa hyväksyttyihin enimmäisasumismenoihin, koska ruokakunnan koko on $2."));
		fraasit.put("AY007FI", new Fraasi("AY007", Kieli.SUOMI, 2, "Asunnon vesimaksuna hyväksytään hoitomenoksi $1 euroa per henkilö, yhteensä $2 euroa."));
		fraasit.put("AY008FI", new Fraasi("AY008", Kieli.SUOMI, 1, "Vuokra-asunnon vuokrana hyväksytään hoitomenoiksi $1 euroa ennen rajausta suhteessa hyvväksyttyihin enimmäisasumismenoihin."));
		fraasit.put("AY009FI", new Fraasi("AY009", Kieli.SUOMI, 1, "Omistusosakkeen vastikkeena hyväksytään hoitomenoiksi $1 euroa ennen rajausta suhteessa hyväksyttyihin enimmäisasumismenoihin."));
		fraasit.put("AY010FI", new Fraasi("AY010", Kieli.SUOMI, 3, "Omistusasunnon rahoitusmenoina hyväksytään $1 euroa ennen rajausta suhteessa hyväksyttyihin enimmäisasumismenoihin, eli $2 prosenttia rahoitusmenoista $3"));
		fraasit.put("AY011FI", new Fraasi("AY011", Kieli.SUOMI, 3, "Osakeasunnon hyväksytyt hoitomenot on rajattu $1 prosenttiin enimmäisasumismenoista $2 euroa - rajattu arvoon $3."));
		fraasit.put("AY012FI", new Fraasi("AY012", Kieli.SUOMI, 3, "Osakeasunnon hyväksytyt rahoitusmenot on rajattu $1 prosenttiin enimmäisasumismenoista $2 euroa - rajattu arvoon $3."));
		fraasit.put("AY013FI", new Fraasi("AY013", Kieli.SUOMI, 3, "Ylijäävästä hoitomenosta huomioidaan $1 prosenttia rahoitusmenoina, jolloin hyväksytyt rahoitusmenot kasvavat $2 => $3"));
		fraasit.put("AY014FI", new Fraasi("AY014", Kieli.SUOMI, 3, "Vuokra-asunnossa alivuokralaisen maksama vuokra $1 vähennetään vuokramenoista $2, vuokra-asunnon hoitomenoiksi hyväksytään $3 euroa."));
	}
	
	public Fraasi(String fraasiKoodi, Kieli kieli, int muuttujienMaara, String fraasiTeksti) {
		this.fraasiKoodi = fraasiKoodi;
		this.kieli = kieli;
		this.fraasiTeksti = fraasiTeksti;
		this.muuttujienMaara = muuttujienMaara;
	}
	
	public String getFraasiKoodi() {
		return fraasiKoodi;
	}
	public void setFraasiKoodi(String fraasiKoodi) {
		this.fraasiKoodi = fraasiKoodi;
	}
	public Kieli getKieli() {
		return kieli;
	}
	public void setKieli(Kieli kieli) {
		this.kieli = kieli;
	}

	public String getFraasiTeksti() {
		return fraasiTeksti;
	}

	public void setFraasiTeksti(String fraasiTeksti) {
		this.fraasiTeksti = fraasiTeksti;
	}

	public static Fraasi haeFraasi(String fraasiKoodi, Kieli kieli) {
		switch(kieli) {
		    case SUOMI: return fraasit.get(fraasiKoodi+"FI"); 
		    case RUOTSI: return fraasit.get(fraasiKoodi+"SV"); 
		    case ENGLANTI: return fraasit.get(fraasiKoodi+"EN"); 
		    default: return fraasit.get(fraasiKoodi+"FI");
		}
	}
	
	public static Map<String, Fraasi> getFraasit() {
		return fraasit;
	}

	public static void setFraasit(Map<String, Fraasi> fraasit) {
		Fraasi.fraasit = fraasit;
	}

	public int getMuuttujienMaara() {
		return muuttujienMaara;
	}

	public void setMuuttujienMaara(int muuttujienMaara) {
		this.muuttujienMaara = muuttujienMaara;
	}

}
