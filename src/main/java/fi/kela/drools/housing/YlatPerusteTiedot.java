package fi.kela.drools.housing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import fi.kela.drools.general.PerusteTiedot;

public class YlatPerusteTiedot extends PerusteTiedot{
	private int kuntaRyhma;
	private String asuinMaakunta;
	private int ruokakunnanKoko = 0;
	private AsuntoTiedot asuntoTiedot;
	private boolean alivuokralainen = false;
	private List<RuokakunnanJasen> ruokakunnanJasenet = new ArrayList<RuokakunnanJasen>();
	private boolean lisatilanTarveHuomioitu = false;

	public AsuntoTiedot getAsuntoTiedot() {
		return asuntoTiedot;
	}
	public void setAsuntoTiedot(AsuntoTiedot asuntoTiedot) {
		this.asuntoTiedot = asuntoTiedot;
	}
	public boolean isAlivuokralainen() {
		return alivuokralainen;
	}
	public void setAlivuokralainen(boolean alivuokralainen) {
		this.alivuokralainen = alivuokralainen;
	}
	public List<RuokakunnanJasen> getRuokakunnanJasenet() {
		return ruokakunnanJasenet;
	}
	public void setRuokakunnanJasenet(List<RuokakunnanJasen> ruokakunnanJasenet) {
		this.ruokakunnanJasenet = ruokakunnanJasenet;
	}
	
	public String ruokakunnanJasenLista() {
		String ruokakunnanJasenet = "";
		int i=0;
	    for(RuokakunnanJasen jasen:getRuokakunnanJasenet()){
	    	if(i>0) {
	    		ruokakunnanJasenet = ruokakunnanJasenet + ", ";
	    	}
	    	i++;
	        ruokakunnanJasenet = ruokakunnanJasenet + jasen.getSukuNimi() + " " + jasen.getEtuNimi() + " (" +jasen.getHetu()+ ")";
	    }
	    return ruokakunnanJasenet;
	}
	
	public int getKuntaRyhma() {
		return kuntaRyhma;
	}
	public void setKuntaRyhma(int kuntaRyhma) {
		this.kuntaRyhma = kuntaRyhma;
	}
	public String getAsuinMaakunta() {
		return asuinMaakunta;
	}
	public void setAsuinMaakunta(String asuinMaakunta) {
		this.asuinMaakunta = asuinMaakunta;
	}
	public int getRuokakunnanKoko() {
		return ruokakunnanKoko;
	}
	public void setRuokakunnanKoko(int ruokakunnanKoko) {
		this.ruokakunnanKoko = ruokakunnanKoko;
	}
	public boolean isLisatilanTarveHuomioitu() {
		return lisatilanTarveHuomioitu;
	}
	public void setLisatilanTarveHuomioitu(boolean lisatilanTarveHuomioitu) {
		this.lisatilanTarveHuomioitu = lisatilanTarveHuomioitu;
	}
	public int getRuokakunnanJasenMaara() {
		return this.getRuokakunnanJasenet().size();
	}
	
	public BigDecimal haeOhjausTieto(String tunnus) {
		return YlatTiedot.getOhjausTietoBigDecimal(tunnus, this.getAlkuPvm());
	}

	public boolean isAsuinMaakuntaItaSuomessa() {
		boolean kyllaEi = false;
		if(asuinMaakunta != null && (asuinMaakunta.equals("ETELÄ-SAVO") || asuinMaakunta.equals("POHJOIS-SAVO") || asuinMaakunta.equals("POHJOIS-KARJALA"))) {
			kyllaEi = true;
		}
		return kyllaEi;
	}

	public boolean isAsuinMaakuntaPohjoisSuomessa() {
		boolean kyllaEi = false;
		if(asuinMaakunta != null && (asuinMaakunta.equals("POHJOIS-POHJANMAA") || asuinMaakunta.equals("KAINUU") || asuinMaakunta.equals("LAPPI"))) {
			kyllaEi = true;
		}
		return kyllaEi;
	}
}
