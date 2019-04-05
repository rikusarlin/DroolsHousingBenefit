package fi.kela.drools.housing;

import java.math.BigDecimal;

import fi.kela.drools.general.RatkaisuTiedot;

public class YlatRatkaisuTiedot extends RatkaisuTiedot {
	BigDecimal enimmaisAsumisMenotEur = new BigDecimal(0);
	BigDecimal hoitoMenoMuu = new BigDecimal(0);
	BigDecimal rahoitusMeno = new BigDecimal(0);
	BigDecimal vuokraMeno = new BigDecimal(0);
	BigDecimal vastikeMeno = new BigDecimal(0);
	BigDecimal vesiMeno = new BigDecimal(0);
	BigDecimal lammitysMeno = new BigDecimal(0);
	
	public BigDecimal getEnimmaisAsumisMenotEur() {
		return enimmaisAsumisMenotEur;
	}

	public void setEnimmaisAsumisMenotEur(BigDecimal enimmaisAsumisMenotEur) {
		this.enimmaisAsumisMenotEur = enimmaisAsumisMenotEur;
	}

	// Tämän pitäisi olla totta kaikissa asumismuodoissa (osa on kyllä aina 0)
	// Maksimissaan enimmäisasumismenojen verran
	public BigDecimal getHyvaksytytAsumismenotEur() {
		int tulos = hoitoMenoMuu.add(rahoitusMeno).add(vuokraMeno).add(vastikeMeno).add(vesiMeno).add(lammitysMeno).compareTo(enimmaisAsumisMenotEur);
		if (tulos==-1 || tulos==0) {
			return hoitoMenoMuu.add(rahoitusMeno).add(vuokraMeno).add(vastikeMeno).add(vesiMeno).add(lammitysMeno);
		} else {
			return enimmaisAsumisMenotEur;
		}
	}

	public BigDecimal getHyvaksytytHoitomenotOsakeEur() {
		return vastikeMeno.add(vesiMeno).add(lammitysMeno);
	}

	public BigDecimal getHoitoMenoMuu() {
		return hoitoMenoMuu;
	}

	public void setHoitoMenoMuu(BigDecimal hoitoMeno) {
		this.hoitoMenoMuu = hoitoMeno;
	}

	public BigDecimal getRahoitusMeno() {
		return rahoitusMeno;
	}

	public void setRahoitusMeno(BigDecimal rahoitusMeno) {
		this.rahoitusMeno = rahoitusMeno;
	}

	public BigDecimal getVuokraMeno() {
		return vuokraMeno;
	}

	public void setVuokraMeno(BigDecimal vuokraMeno) {
		this.vuokraMeno = vuokraMeno;
	}

	public BigDecimal getVastikeMeno() {
		return vastikeMeno;
	}

	public void setVastikeMeno(BigDecimal vastikeMeno) {
		this.vastikeMeno = vastikeMeno;
	}

	public BigDecimal getVesiMeno() {
		return vesiMeno;
	}

	public void setVesiMeno(BigDecimal vesiMeno) {
		this.vesiMeno = vesiMeno;
	}

	public BigDecimal getLammitysMeno() {
		return lammitysMeno;
	}

	public void setLammitysMeno(BigDecimal lammitysMeno) {
		this.lammitysMeno = lammitysMeno;
	}
	
	public boolean isHoitoMenoja() {
		return (this.hoitoMenoMuu.compareTo(new BigDecimal(0)) > 0);
	}
	
	public boolean isLammitysMenoja() {
		return (this.lammitysMeno.compareTo(new BigDecimal(0)) > 0);
	}

}
