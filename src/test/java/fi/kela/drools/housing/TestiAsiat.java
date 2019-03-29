package fi.kela.drools.housing;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestiAsiat {

	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	
    Date parseDate(String dateStr){
    	try {
    		return sdf.parse(dateStr);
    	} catch(ParseException pe) {
    		return null;
    	}
    }
    
	public EtuusAsia getRyhma1Koko1_2015() {
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAlkuPvm(parseDate("01.02.2015"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		perusteet.setAsuntoTiedot(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getRyhma1Koko1_2018() {
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAlkuPvm(parseDate("01.02.2018"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		perusteet.setAsuntoTiedot(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getRyhma1Koko5_2015() {
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAlkuPvm(parseDate("01.02.2015"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(5));
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		perusteet.setAsuntoTiedot(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}
	
	public EtuusAsia getRyhma1Koko5_2018() {
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAlkuPvm(parseDate("01.02.2018"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(5));
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		perusteet.setAsuntoTiedot(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}
	
	public EtuusAsia getRyhma1Koko6_2015() {
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAlkuPvm(parseDate("01.02.2015"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(6));
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		perusteet.setAsuntoTiedot(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}
	
	public EtuusAsia getYksinVuokrallaAsuva_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVuokraEur(new BigDecimal(820));
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2015"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}
	
	public EtuusAsia getYksinVuokrallaAsuvaSavo_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("419"); // Mikkeli = kuntaryhmä 3, maakunta ETELÄ-SAVO
		asunto.setAsuinKunta("Mikkeli");
		asunto.setVuokraEur(new BigDecimal(420));
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		asunto.setLammitysKustannuksetEur(new BigDecimal(30)); // Tähän tulee 4 prosentin korotus, koska Etelä-Savo
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(3);
		perusteet.setAsuinMaakunta("ETELÄ-SAVO");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);

		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinVuokrallaAsuvaAlivuokralaisellaSavo_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("419"); // Mikkeli = kuntaryhmä 3, maakunta ETELÄ-SAVO
		asunto.setAsuinKunta("Mikkeli");
		asunto.setVuokraEur(new BigDecimal(420));
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		asunto.setLammitysKustannuksetEur(new BigDecimal(30)); // Tähän tulee 4 prosentin korotus, koska Etelä-Savo
		asunto.setAlivuokralaisenMaksamaVuokraEur(new BigDecimal(150));
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(3);
		perusteet.setAsuinMaakunta("ETELÄ-SAVO");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinOmistusOsakeEiRahoitusmenoja_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_OSAKE);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVastikeEur(new BigDecimal(420));
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinOmistusOsakeRahoitusmenoja_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_OSAKE);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVastikeEur(new BigDecimal(620)); // Tästä 0,3 * 508 = 152,4 hyväksytään, lopusta 73% rahoitusmenoihin (341,348)
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		asunto.setRahoitusMenotEur(new BigDecimal(120)); // Tästä 73 pros hyväksytään = 87.6. Yhteensä 341,348 + 87.6 = 428.948. Max on 355.6, se saadaan
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);

		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinOmistusOsakePaljonRahoitusmenojaJaVastiketta_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_OSAKE);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVastikeEur(new BigDecimal(200)); // Tämä (tai oik vastike + vesi) rajataan 30 prosenttiin enimmäisasumismenoista, 0,3 * 508 = 152,4 (ylijäämä rahoitusmenoihin)
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		asunto.setRahoitusMenotEur(new BigDecimal(500)); // Tästä 73 pros hyväksytään - mutta rajataan 70 prosenttiin enimmäisasumismenoista (ei koko 365, vain 355,6) 
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinOmistusOsakePaljonVastiketta_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_OSAKE);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVastikeEur(new BigDecimal(320)); // Tämä (oik. vastike+vesi) rajataan 30 prosenttiin enimmäisasumismenoista, 0,3 * 508 = 152,4 (ylijäämästä 73 pros rahoitusmenoihin)
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		asunto.setRahoitusMenotEur(new BigDecimal(200)); // Tästä 73 pros hyväksytään = 146, plus hoitomenojen ylijäämästä 73 pros = 133.298, yht. 279.298
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinMuuOmistus_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_MUU);
		asunto.setRahoitusMenotEur(new BigDecimal(500)); // Tästä 73 prosenttia, lisäksi pitäisi tulla 89 euroa hoitomenoja (ruokakunnan koon mukaan)
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinMuuOmistusKainuu_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_MUU);
		asunto.setRahoitusMenotEur(new BigDecimal(300)); // Tästä 73 prosenttia, lisäksi pitäisi tulla 89*1,08 euroa hoitomenoja (ruokakunnan koon mukaan)
		asunto.setKuntaNumero("205");
		asunto.setAsuinKunta("Kajaani");
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(4);
		perusteet.setAsuinMaakunta("KAINUU");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia get5HloMuuOmistus_2018() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.OMISTUS_MUU);
		asunto.setRahoitusMenotEur(new BigDecimal(900)); // Tästä 73 prosenttia, lisäksi pitäisi tulla 224 euroa hoitomenoja (ruokakunnan koon mukaan)
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2018"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(5));
		perusteet.setAsuntoTiedot(asunto);

		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia get2HloVuokrallaAsuva_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVuokraEur(new BigDecimal(620));
		asunto.setVesiPerHenkiloEur(new BigDecimal(15));
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(2));
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia getYksinVuokrallaAsuvaVammainen_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVuokraEur(new BigDecimal(620));
		asunto.setVesiPerHenkiloEur(new BigDecimal(19));
		asunto.setLammitysKustannuksetEur(new BigDecimal(30));
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		perusteet.getRuokakunnanJasenet().get(0).setLisatilanTarve(true);
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia get2VuokrallaAsuvaaVammaista_2015() {		
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVuokraEur(new BigDecimal(620));
		asunto.setVesiPerHenkiloEur(new BigDecimal(19));
		asunto.setLammitysKustannuksetEur(new BigDecimal(30));;
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(2));
		perusteet.getRuokakunnanJasenet().get(0).setLisatilanTarve(true);
		perusteet.getRuokakunnanJasenet().get(1).setLisatilanTarve(true);
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	public EtuusAsia get3VuokrallaAsuvaaVammaista_2015() {
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		asunto.setVuokraEur(new BigDecimal(620));
		asunto.setVesiPerHenkiloEur(new BigDecimal(19));
		asunto.setLammitysKustannuksetEur(new BigDecimal(30));;
		// Teoriassa tässä välissä pitäisi lukea kuntanumeron perusteella nämä jostain
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setKuntaRyhma(1);
		perusteet.setAsuinMaakunta("UUSIMAA");
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(3));
		perusteet.getRuokakunnanJasenet().get(0).setLisatilanTarve(true);
		perusteet.getRuokakunnanJasenet().get(1).setLisatilanTarve(true);
		perusteet.getRuokakunnanJasenet().get(2).setLisatilanTarve(true);
		perusteet.setAsuntoTiedot(asunto);
		
		EtuusAsia etuusAsia = teePerusEtuusAsia();
		etuusAsia.setPerusteTiedot(perusteet);
		return etuusAsia;
	}

	
    private List<RuokakunnanJasen> lisaaRuokakunnanJasenet(int nMaara){
    	List<RuokakunnanJasen> jasenet = new ArrayList<RuokakunnanJasen>();
    	if(nMaara>0) {
    		RuokakunnanJasen jasen1 = new RuokakunnanJasen();
    		jasen1.setEtuNimi("Riku");
    		jasen1.setSukuNimi("Sarlin");
    		jasen1.setHetu("01011900-001A");
    		jasenet.add(jasen1);
    	}
    	if(nMaara>1) {
    		RuokakunnanJasen jasen2 = new RuokakunnanJasen();
    		jasen2.setEtuNimi("Helena");
    		jasen2.setSukuNimi("Sarlin");
    		jasen2.setHetu("01011900-002B");
    		jasen2.setLisatilanTarve(false);
    		jasenet.add(jasen2);
    	}
    	if(nMaara>2) {
    		RuokakunnanJasen jasen3 = new RuokakunnanJasen();
    		jasen3.setEtuNimi("Elsa");
    		jasen3.setSukuNimi("Sarlin");
    		jasen3.setHetu("01011900-004C");
    		jasen3.setLisatilanTarve(false);
    		jasenet.add(jasen3);
    	}
    	if(nMaara>3) {
    		RuokakunnanJasen jasen4 = new RuokakunnanJasen();
    		jasen4.setEtuNimi("Leo");
    		jasen4.setSukuNimi("Sarlin");
    		jasen4.setHetu("01011900-005D");
    		jasen4.setLisatilanTarve(false);
    		jasenet.add(jasen4);
    	}
    	if(nMaara>4) {
    		RuokakunnanJasen jasen5 = new RuokakunnanJasen();
    		jasen5.setEtuNimi("Tipsu");
    		jasen5.setSukuNimi("Sarlin");
    		jasen5.setHetu("01011900-006E");
    		jasen5.setLisatilanTarve(false);
    		jasenet.add(jasen5);    		
    	}
    	if(nMaara>5) {
    		RuokakunnanJasen jasen6 = new RuokakunnanJasen();
    		jasen6.setEtuNimi("Maxu");
    		jasen6.setSukuNimi("Sarlin");
    		jasen6.setHetu("01011900-007F");
    		jasen6.setLisatilanTarve(false);
    		jasenet.add(jasen6);
    	}
    	return jasenet;
    }
    
    private EtuusAsia teePerusEtuusAsia() {
		EtuusAsia etuusAsia = new EtuusAsia();
		etuusAsia.setAsiaId(1001);
		etuusAsia.setEtuus(Etuus.YLEINEN_ASUMISTUKI);
		Asiakas asiakas = new Asiakas();
		asiakas.setKieli(Kieli.SUOMI);
		asiakas.setAsiakkaanTyyppi(AsiakkaanTyyppi.HENKILO_ASIAKAS);
		etuusAsia.setAsiakas(asiakas);
		Henkilo henkilo = new Henkilo();
		henkilo.setEtuNimi("Riku");
		henkilo.setSukuNimi("Sarlin");
		henkilo.setHetu("01011900-001A");
		asiakas.setHenkiloAsiakas(henkilo);
		RatkaisuTiedot ratkaisu = new RatkaisuTiedot();
		etuusAsia.setRatkaisuTiedot(ratkaisu);
		
		PerusteTiedot perusteet = new PerusteTiedot();
		perusteet.setAlkuPvm(parseDate("01.02.2016"));
		perusteet.setRuokakunnanJasenet(lisaaRuokakunnanJasenet(1));
		AsuntoTiedot asunto = new AsuntoTiedot();
		asunto.setAsunnonTyyppi(AsunnonTyyppi.VUOKRA);
		asunto.setRahoitusMenotEur(new BigDecimal(500.0)); // Tästä 73 prosenttia, lisäksi pitäisi tulla 89*1,08 euroa hoitomenoja (ruokakunnan koon mukaan)
		asunto.setKuntaNumero("092");
		asunto.setAsuinKunta("Helsinki");
		perusteet.setAsuntoTiedot(asunto);	
		etuusAsia.setPerusteTiedot(perusteet);
		
		return etuusAsia;
    }

}
