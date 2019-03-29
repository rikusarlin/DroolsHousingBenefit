package fi.kela.drools.housing;

import java.math.BigDecimal;

public class AsuntoTiedot {
	private AsunnonTyyppi asunnonTyyppi;
	private String kuntaNumero;
	private String asuinKunta;
	private BigDecimal vuokraEur = new BigDecimal(0);
	private BigDecimal vastikeEur = new BigDecimal(0);
	private BigDecimal rahoitusMenotEur = new BigDecimal(0);
	private BigDecimal vesiPerHenkiloEur = new BigDecimal(0);
	private BigDecimal lammitysKustannuksetEur = new BigDecimal(0);
	private BigDecimal alivuokralaisenMaksamaVuokraEur = new BigDecimal(0);
	
	public AsunnonTyyppi getAsunnonTyyppi() {
		return asunnonTyyppi;
	}
	public void setAsunnonTyyppi(AsunnonTyyppi asunnonTyyppi) {
		this.asunnonTyyppi = asunnonTyyppi;
	}
	public BigDecimal getVuokraEur() {
		return vuokraEur;
	}
	public void setVuokraEur(BigDecimal vuokraEur) {
		this.vuokraEur = vuokraEur;
	}
	public BigDecimal getVastikeEur() {
		return vastikeEur;
	}
	public void setVastikeEur(BigDecimal vastikeEur) {
		this.vastikeEur = vastikeEur;
	}
	public BigDecimal getRahoitusMenotEur() {
		return rahoitusMenotEur;
	}
	public void setRahoitusMenotEur(BigDecimal rahoitusMenotEur) {
		this.rahoitusMenotEur = rahoitusMenotEur;
	}
	public BigDecimal getVesiPerHenkiloEur() {
		return vesiPerHenkiloEur;
	}
	public void setVesiPerHenkiloEur(BigDecimal vesiPerHenkiloEur) {
		this.vesiPerHenkiloEur = vesiPerHenkiloEur;
	}
	public BigDecimal getLammitysKustannuksetEur() {
		return lammitysKustannuksetEur;
	}
	public void setLammitysKustannuksetEur(BigDecimal lammitysKustannuksetEur) {
		this.lammitysKustannuksetEur = lammitysKustannuksetEur;
	}
	public BigDecimal getAlivuokralaisenMaksamaVuokraEur() {
		return alivuokralaisenMaksamaVuokraEur;
	}
	public void setAlivuokralaisenMaksamaVuokraEur(BigDecimal alivuokralaisenMaksamaVuokraEur) {
		this.alivuokralaisenMaksamaVuokraEur = alivuokralaisenMaksamaVuokraEur;
	}
	public String getKuntaNumero() {
		return kuntaNumero;
	}
	public void setKuntaNumero(String kuntaNumero) {
		this.kuntaNumero = kuntaNumero;
	}
	public String getAsuinKunta() {
		return asuinKunta;
	}
	public void setAsuinKunta(String asuinKunta) {
		this.asuinKunta = asuinKunta;
	}
}
