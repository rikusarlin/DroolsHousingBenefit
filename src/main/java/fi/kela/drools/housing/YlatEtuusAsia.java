package fi.kela.drools.housing;

import java.math.BigDecimal;

import fi.kela.drools.general.EtuusAsia;
import fi.kela.drools.general.PaatoksenFraasi;

public class YlatEtuusAsia extends EtuusAsia{
	YlatPerusteTiedot perusteTiedot;
	YlatRatkaisuTiedot ratkaisuTiedot;
	public YlatPerusteTiedot getPerusteTiedot() {
		return perusteTiedot;
	}
	public void setPerusteTiedot(YlatPerusteTiedot perusteTiedot) {
		this.perusteTiedot = perusteTiedot;
	}
	public YlatRatkaisuTiedot getRatkaisuTiedot() {
		return ratkaisuTiedot;
	}
	public void setRatkaisuTiedot(YlatRatkaisuTiedot ratkaisuTiedot) {
		this.ratkaisuTiedot = ratkaisuTiedot;
	}
	
	public void lisaaFraasi(String fraasinTunnus) {
		if(fraasinTunnus.equals("AY001")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY001", this.getAsiakas().getKieli(), 
					(this.getPerusteTiedot().getRuokakunnanJasenet().size()+1)+""));
		} else if(fraasinTunnus.equals("AY002")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY002", this.getAsiakas().getKieli(), 
					this.getPerusteTiedot().getRuokakunnanKoko()+"", this.getPerusteTiedot().ruokakunnanJasenLista()));
		} else if(fraasinTunnus.equals("AY003")) {
			this.getRatkaisuTiedot().getFraasit().add(
					new PaatoksenFraasi("AY003",this.getAsiakas().getKieli(),
							this.getPerusteTiedot().getAsuntoTiedot().getAsuinKunta(),
							this.getPerusteTiedot().getKuntaRyhma()+"",
							this.getPerusteTiedot().getRuokakunnanKoko()+"",
							this.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		}else if(fraasinTunnus.equals("AY004")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY004", this.getAsiakas().getKieli(),
					this.getRatkaisuTiedot().getLammitysMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if(fraasinTunnus.equals("AY005")) {
			BigDecimal korotus = this.getPerusteTiedot().haeOhjausTieto(YlatTiedot.KUSTANNUS_KOROTUS_ITA);
			if(this.getPerusteTiedot().isAsuinMaakuntaPohjoisSuomessa()) {
				korotus = this.getPerusteTiedot().haeOhjausTieto(YlatTiedot.KUSTANNUS_KOROTUS_POHJOINEN);
			}
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY005", this.getAsiakas().getKieli(),
					korotus.multiply(new BigDecimal(100)).setScale(0,BigDecimal.ROUND_HALF_EVEN).toString(),
					this.getPerusteTiedot().getAsuinMaakunta()));
		} else if(fraasinTunnus.equals("AY006")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY006", this.getAsiakas().getKieli(),
					this.getRatkaisuTiedot().getHoitoMenoMuu().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
					this.getPerusteTiedot().getRuokakunnanJasenMaara()+""));
		} else if(fraasinTunnus.equals("AY007")) {
			BigDecimal hyvaksyttyVesimaksuPerHlo = this.getRatkaisuTiedot().getVesiMeno().divide(
					new BigDecimal(this.getPerusteTiedot().getRuokakunnanJasenMaara()));	
		    this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY007", this.getAsiakas().getKieli(), 
		    		hyvaksyttyVesimaksuPerHlo.setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
		    		this.getRatkaisuTiedot().getVesiMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if(fraasinTunnus.equals("AY008")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY008", this.getAsiakas().getKieli(), 
				this.getRatkaisuTiedot().getVuokraMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if(fraasinTunnus.equals("AY009")) {
			this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY009", this.getAsiakas().getKieli(), 
				this.getRatkaisuTiedot().getVastikeMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if(fraasinTunnus.equals("AY010")) {
	        	this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY010", this.getAsiakas().getKieli(), 
	        		this.getRatkaisuTiedot().getRahoitusMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
	        		this.getPerusteTiedot().haeOhjausTieto(YlatTiedot.RAHOITUSMENOT_KORVATTAVA_OSUUS).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
	        		this.getPerusteTiedot().getAsuntoTiedot().getRahoitusMenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if(fraasinTunnus.equals("AY014")) {
			BigDecimal alivuokra = this.getPerusteTiedot().getAsuntoTiedot().getAlivuokralaisenMaksamaVuokraEur();
		    BigDecimal vuokraMeno = this.getRatkaisuTiedot().getVuokraMeno();
		    BigDecimal vanhaVuokraMeno = vuokraMeno.add(alivuokra);
        	this.getRatkaisuTiedot().getFraasit().add(new PaatoksenFraasi("AY014", this.getAsiakas().getKieli(), 
    	            alivuokra.setScale(2).toString(),
    	            vanhaVuokraMeno.setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
    	            vuokraMeno.setScale(2).toString()));
		}
	}
	
	public void laskeMenot() {
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();

		laskeRuokakunnanKoko();
		
		laskeEnimmaisAsumisMenot();
		
		if(((asunto.isVuokraAsunto() || asunto.isOmistusOsake()) && asunto.isLammitysKustannuksia())) {
			laskeLammitysMenot();
		}
		
		if(((asunto.isVuokraAsunto() || asunto.isOmistusOsake()) && asunto.isVesiKustannuksia())) {
			laskeVesiMenot();
		}
		
	    if(asunto.isVuokraAsunto() && asunto.isVuokraa()) {
	    	laskeVuokra();
	    } else if(asunto.isOmistusOsake() && asunto.isVastiketta()) {
	    	laskeVastike();
	    } else if(asunto.isMuuOmistus()) {
	    	laskeMuunOmistusAsunnonHoitokustannukset();
	    }
	    
	    if((asunto.isMuuOmistus() || asunto.isOmistusOsake()) && asunto.isRahoitusMenoja()) {
	    	laskeOmistusAsunnonRahoitusmenot();
	    }
	    
	    if(asunto.isVuokraAsunto() && asunto.isTulojaAlivuokralaisesta()) {
	    	huomioiAlivuokralainen();
	    }
	    
	    if(per.isAsuinMaakuntaItaSuomessa() && (rat.isLammitysMenoja() || rat.isHoitoMenoja())) {
	    	korotaHoitoMenoja(per.haeOhjausTieto(YlatTiedot.KUSTANNUS_KOROTUS_ITA));
	    } else if(per.isAsuinMaakuntaPohjoisSuomessa() && (rat.isLammitysMenoja() || rat.isHoitoMenoja())) {
	    	korotaHoitoMenoja(per.haeOhjausTieto(YlatTiedot.KUSTANNUS_KOROTUS_POHJOINEN));
	    }
	    
	    if(asunto.isOmistusOsake() && (asunto.isVastiketta() || asunto.isLammitysKustannuksia() || asunto.isVesiKustannuksia() || asunto.isRahoitusMenoja())) {
	    	rajaaHoitomenot();
	    }
	}
	
	private void laskeEnimmaisAsumisMenot() {
		YlatPerusteTiedot per = this.getPerusteTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		int ruokakunnanKoko = per.getRuokakunnanKoko();
		// Ohjausstiedon tunniste on muotoa EnimmaisMenot_Ryhma1_3, missä eka numero on kuntaryhmä, toinen ruokakunnan koko
		// Jos on yli henkeä, lisäys per henki -ohjaustiedon nimi on tyyliä EnimmaisMenot_Ryhma2_N
		String tunniste = "EnimmaisMenot_Ryhma"+per.getKuntaRyhma()+ "_";
		if(ruokakunnanKoko <= 4) {
			tunniste = tunniste + ruokakunnanKoko;
			rat.setEnimmaisAsumisMenotEur(per.haeOhjausTieto(tunniste));
		} else {
			String tunniste4 = tunniste + "4";
			tunniste = tunniste + "N";
			BigDecimal for4Persons = per.haeOhjausTieto(tunniste4);
			BigDecimal over4PerPerson = per.haeOhjausTieto(tunniste);
			rat.setEnimmaisAsumisMenotEur(
					for4Persons.add((new BigDecimal(ruokakunnanKoko).subtract(new BigDecimal(4)).multiply(over4PerPerson))));
		}
		lisaaFraasi("AY003");
	}
	
	private void laskeRuokakunnanKoko() {
		YlatPerusteTiedot per = this.getPerusteTiedot();
		int koko = per.getRuokakunnanJasenMaara();
		this.getPerusteTiedot().setRuokakunnanKoko(koko);
		lisaaFraasi("AY002");
		for(RuokakunnanJasen jasen:per.getRuokakunnanJasenet()) {
			// Ruokakunnan laskennallinen koko kasvaa yhdellä, jos on jäsen, joka tarvitsee lisätilaa
			if(jasen.isLisatilanTarve()) {
				koko = koko +1;
				this.getPerusteTiedot().setRuokakunnanKoko(koko);
				per.setLisatilanTarveHuomioitu(true);
				lisaaFraasi("AY001");
				break;
			}
		}
	}
	
	private void laskeLammitysMenot(){
		// YLAT 9§
		//Vuokra-asunnossa asuvan ruokakunnan asumismenoiksi hyväksytään vuokra ja erikseen maksettavat vesimaksut ja lämmityskustannukset.
		//Erikseen maksettavina vesimaksuina otetaan huomioon 17 euroa henkilöä kohden kuukaudessa.
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();
		BigDecimal lammitysKustannukset = new BigDecimal(0);
		BigDecimal lammitysPohja = new BigDecimal(0);
		BigDecimal rajaArvo = per.haeOhjausTieto(YlatTiedot.MAX_LAMMITYS_KK);
		BigDecimal lisaPerHlo = per.haeOhjausTieto(YlatTiedot.LAMMITYS_LISAHLO_KK);
		int ruokakunnanJasenet = per.getRuokakunnanJasenMaara();
		if(this.getPerusteTiedot().getAsuntoTiedot().getLammitysKustannuksetEur().compareTo(rajaArvo) > 0){
			lammitysPohja = rajaArvo;
		} else {
			lammitysPohja = asunto.getLammitysKustannuksetEur();
		}
		if(ruokakunnanJasenet == 1){
			lammitysKustannukset = lammitysPohja;
		} else if (ruokakunnanJasenet > 1){
			lammitysKustannukset = lammitysPohja.add((new BigDecimal(ruokakunnanJasenet-1)).multiply(lisaPerHlo)); 
		}
		rat.setLammitysMeno(lammitysKustannukset);
		lisaaFraasi("AY004");
	}
	
	private void laskeVesiMenot() {
		// YLAT 9§ mom 1
		//Vuokra-asunnossa asuvan ruokakunnan asumismenoiksi hyväksytään vuokra ja erikseen maksettavat vesimaksut ja lämmityskustannukset.
		//Erikseen maksettavina lämmityskustannuksina 38 euroa kuukaudessa yhden hengen ruokakunnassa.
		//Jos ruokakuntaan kuuluu useampi kuin yksi henkilö, lämmityskustannuksiin lisätään 13 euroa jokaista lisähenkilöä kohden.
		//
		// Osakeasunnon hoitomenoiksi hyväksytään vastike sekä erikseen maksettavat vesimaksut ja lämmityskustannukset.
		// Vesimaksut ja lämmityskustannukset otetaan huomioon 1 momentin mukaisina.
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();
		BigDecimal vesimaksu = new BigDecimal(0);
		BigDecimal hyvaksyttyVesimaksuPerHlo = new BigDecimal(0);
		BigDecimal rajaArvo = per.haeOhjausTieto(YlatTiedot.MAX_VESIMAKSU_HLO_KK);
		if(asunto.getVesiPerHenkiloEur().compareTo(rajaArvo) > 0) {
			hyvaksyttyVesimaksuPerHlo = rajaArvo;
		} else {
			hyvaksyttyVesimaksuPerHlo = asunto.getVesiPerHenkiloEur();
		}
		vesimaksu = hyvaksyttyVesimaksuPerHlo.multiply(new BigDecimal(per.getRuokakunnanJasenMaara()));
		rat.setVesiMeno(vesimaksu);
		lisaaFraasi("AY007");
	}
	
	private void laskeVuokra() {
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
    	BigDecimal vuokra = asunto.getVuokraEur();       
    	rat.setVuokraMeno(vuokra);
    	lisaaFraasi("AY008");
	}
	
	private void laskeVastike() {
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
    	rat.setVastikeMeno(asunto.getVastikeEur());
    	lisaaFraasi("AY009");
	}

	private void laskeMuunOmistusAsunnonHoitokustannukset() {
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();
		BigDecimal hoitoMenot = new BigDecimal(0);
		int ruokakunnanJasenMaara = per.getRuokakunnanJasenMaara();
		switch (ruokakunnanJasenMaara){
		case 1: hoitoMenot = per.haeOhjausTieto(YlatTiedot.HOITOMENO_1HLO); break;
		case 2: hoitoMenot = per.haeOhjausTieto(YlatTiedot.HOITOMENO_2HLO); break;
		case 3: hoitoMenot = per.haeOhjausTieto(YlatTiedot.HOITOMENO_3HLO); break;
		case 4: hoitoMenot = per.haeOhjausTieto(YlatTiedot.HOITOMENO_4HLO); break;
		default:
			BigDecimal hoitoMeno4 = per.haeOhjausTieto(YlatTiedot.HOITOMENO_4HLO);
			BigDecimal hoitoMenoYli4 = per.haeOhjausTieto(YlatTiedot.HOITOMENO_YLI4HLO);
			hoitoMenot = hoitoMeno4.add((new BigDecimal(ruokakunnanJasenMaara-4)).multiply(hoitoMenoYli4)); 
			break;
		}
		rat.setHoitoMenoMuu(hoitoMenot);
		lisaaFraasi("AY006");
	}
	
	private void laskeOmistusAsunnonRahoitusmenot() {
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();
        BigDecimal korvattavaOsuus = per.haeOhjausTieto(YlatTiedot.RAHOITUSMENOT_KORVATTAVA_OSUUS);
        BigDecimal hyvaksytytRahoitusMenot = asunto.getRahoitusMenotEur().multiply(korvattavaOsuus);
        rat.setRahoitusMeno(hyvaksytytRahoitusMenot);
        lisaaFraasi("AY010");
	}
	
	private void korotaHoitoMenoja(BigDecimal korotusProsentti) {
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		rat.setLammitysMeno(rat.getLammitysMeno().multiply(new BigDecimal(1.0).add(korotusProsentti))); 
        rat.setHoitoMenoMuu(rat.getHoitoMenoMuu().multiply(new BigDecimal(1.0).add(korotusProsentti)));
       	lisaaFraasi("AY005");
	}
	
	private void huomioiAlivuokralainen() {
		AsuntoTiedot asunto = this.getPerusteTiedot().getAsuntoTiedot();
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();

		BigDecimal alivuokra = asunto.getAlivuokralaisenMaksamaVuokraEur();
	    BigDecimal vuokraMeno = rat.getVuokraMeno();
	    BigDecimal uusiVuokraMeno = vuokraMeno.subtract(alivuokra);
	    // Kaipa tämäkin on mahdollista - ei mennä negatiivisen puolelle?
	    if(vuokraMeno.compareTo(alivuokra) < 0){
	    	uusiVuokraMeno = new BigDecimal(0);
	    }
	    rat.setVuokraMeno(uusiVuokraMeno);
	    lisaaFraasi("AY014");
	}
	
	private void rajaaHoitomenot() {
		YlatRatkaisuTiedot rat = this.getRatkaisuTiedot();
		YlatPerusteTiedot per = this.getPerusteTiedot();

		BigDecimal maxHoitoMenotOsuus = per.haeOhjausTieto(YlatTiedot.MAX_HOITOMENOT_OSUUS);
		BigDecimal maxRahoitusMenotOsuus = per.haeOhjausTieto(YlatTiedot.MAX_RAHOITUSMENOT_OSUUS);
		BigDecimal enimmaisHoitoMeno = maxHoitoMenotOsuus.multiply(rat.getEnimmaisAsumisMenotEur());
		BigDecimal enimmaisRahoitusMeno = maxRahoitusMenotOsuus.multiply(rat.getEnimmaisAsumisMenotEur());
		BigDecimal korvattavaOsuus = per.haeOhjausTieto(YlatTiedot.RAHOITUSMENOT_KORVATTAVA_OSUUS);
		BigDecimal lisaRahoitusMeno = new BigDecimal(0);
		if(rat.getHyvaksytytHoitomenotOsakeEur().compareTo(enimmaisHoitoMeno) > 0){
			lisaRahoitusMeno = rat.getHyvaksytytHoitomenotOsakeEur().subtract(enimmaisHoitoMeno).multiply(korvattavaOsuus);
			// Korjataan vastiketta (voisi korjata myös lämmitys- tai vesikustannuksia, mutta tämä selkeämpää?
			rat.setVastikeMeno(enimmaisHoitoMeno.subtract(rat.getVesiMeno()).subtract(rat.getLammitysMeno()));
			rat.getFraasit().add(new PaatoksenFraasi("AY011", this.getAsiakas().getKieli(), 
					(maxHoitoMenotOsuus.multiply(new BigDecimal(100))).setScale(0,BigDecimal.ROUND_HALF_EVEN).toString(),
					rat.getEnimmaisAsumisMenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
					enimmaisHoitoMeno.setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		}
		if(rat.getRahoitusMeno().add(lisaRahoitusMeno).compareTo(enimmaisRahoitusMeno) > 0){
			rat.setRahoitusMeno(enimmaisRahoitusMeno);
			rat.getFraasit().add(new PaatoksenFraasi("AY012", this.getAsiakas().getKieli(), 
					(maxRahoitusMenotOsuus.multiply(new BigDecimal(100))).setScale(0,BigDecimal.ROUND_HALF_EVEN).toString(),
					rat.getEnimmaisAsumisMenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(),
					enimmaisRahoitusMeno.setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
		} else if (lisaRahoitusMeno.compareTo(new BigDecimal(0)) > 0){
			rat.getFraasit().add(new PaatoksenFraasi("AY013", this.getAsiakas().getKieli(),
					(korvattavaOsuus.multiply(new BigDecimal(100))).setScale(0,BigDecimal.ROUND_HALF_EVEN).toString(),
					rat.getRahoitusMeno().setScale(2,BigDecimal.ROUND_HALF_EVEN).toString(), 
					rat.getRahoitusMeno().add(lisaRahoitusMeno).setScale(2,BigDecimal.ROUND_HALF_EVEN).toString()));
			rat.setRahoitusMeno(this.getRatkaisuTiedot().getRahoitusMeno().add(lisaRahoitusMeno));
		}
	}
}
