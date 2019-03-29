package fi.kela.drools.housing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fi.kela.drools.util.FraasienAvaaja;
import fi.kela.drools.util.KnowledgeSessionHelper;

public class TestMaxAsumismenot {
	
    static Logger logger = LoggerFactory.getLogger(TestMaxAsumismenot.class.getName());
    static KieContainer kieContainer = null;
	StatelessKieSession sessionStateless = null;
	KieSession sessionStateful = null;
    TestiAsiat testiAsiat = new TestiAsiat();
    	
	@Rule
	public TestRule watcher = new TestWatcher() {
	   protected void starting(Description description) {
	     logger.info("++++++++++++++++++++++++++++++++++ Starting test: " + description.getMethodName() + " +++++++++++++++++++++++++++++++");
	   }
	};
	
    @BeforeClass
    public static void beforeClass(){
        kieContainer=KnowledgeSessionHelper.createRuleBase();
    }

    @Before
    public void beforeTest(){
        sessionStateful = KnowledgeSessionHelper
	             .getStatefulKnowledgeSessionForJBPM(kieContainer,"ksession-housing");
    }

    @After
    public void afterTest(){
    	sessionStateful.dispose();
    }

    @Test
	public void testMaxAsumismenotRyhma1Koko1_2015() {
		EtuusAsia etuusAsia = testiAsiat.getRyhma1Koko1_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
		sessionStateful.startProcess("housingCostsProcess");
		sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
	}

    @Test
	public void testMaxAsumismenotRyhma1Koko1_2018() {
		EtuusAsia etuusAsia = testiAsiat.getRyhma1Koko1_2018();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
		sessionStateful.startProcess("housingCostsProcess");
		sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 516.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(516.0))==0);
	}

    @Test
	public void testMaxAsumismenotRyhma1Koko5_2015() {
		EtuusAsia etuusAsia = testiAsiat.getRyhma1Koko5_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
		sessionStateful.startProcess("housingCostsProcess");
		sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 1232.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(1232.0))==0);
	}

    @Test
	public void testMaxAsumismenotRyhma1Koko5_2018() {
		EtuusAsia etuusAsia = testiAsiat.getRyhma1Koko5_2018();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
		sessionStateful.startProcess("housingCostsProcess");
		sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 1250.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(1250.0))==0);
	}

    @Test
	public void testMaxAsumismenotRyhma1Koko6_2015() {
		EtuusAsia etuusAsia = testiAsiat.getRyhma1Koko6_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
		sessionStateful.startProcess("housingCostsProcess");	
		sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 1369.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(1369.0))==0);
	}
    
    @Test
	public void testYksinVuokrallaAsuva_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinVuokrallaAsuva_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        // Maksimissaan hyväksytän enimmäisasumismenojen mukaan
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().compareTo(new BigDecimal(508.0))==0);
 }

    @Test
	public void testYksinVuokrallaAsuvaSavo_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinVuokrallaAsuvaSavo_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
 	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 411.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(411.0))==0);
        logger.info("Expected: 411.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().compareTo(new BigDecimal(411.0))==0);
   }

    @Test
	public void testYksinVuokrallaAsuvaAlivuokralaisellaSavo_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinVuokrallaAsuvaAlivuokralaisellaSavo_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 411.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(411.0))==0);
        logger.info("Expected: 316.20, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN));
        System.out.println("Expected: 316.20, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN));
        if(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur() != null && etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN) != null) {
        	Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).doubleValue()==316.20);
        }
    }
   

    @Test
	public void testYksinOmistusOsakeEiRahoitusmenoja_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinOmistusOsakeEiRahoitusmenoja_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);		
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        logger.info("Expected: 358.698, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(3, BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(3,BigDecimal.ROUND_HALF_EVEN).doubleValue()==358.698);
    }

    @Test
	public void testYksinOmistusOsakeRahoitusmenoja_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinOmistusOsakeRahoitusmenoja_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
 	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==508.0);
    }

    @Test
	public void testYksinOmistusOsakePaljonRahoitusmenojaJaVastiketta_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinOmistusOsakePaljonRahoitusmenojaJaVastiketta_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==508.0);
    }

    @Test
	public void testYksinOmistusOsakePaljonVastiketta_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinOmistusOsakePaljonVastiketta_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        logger.info("Expected: 431.698, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(3,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(3,BigDecimal.ROUND_HALF_EVEN).doubleValue()==431.698);
		sessionStateful.dispose();    	
    }

    @Test
	public void testYksinMuuOmistus_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinMuuOmistus_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 508.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(508.0))==0);
        logger.info("Expected: 454.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==454.0);
    }

    @Test
	public void testYksinMuuOmistusKainuu_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinMuuOmistusKainuu_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 362.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(362.0))==0);
        logger.info("Expected: 315.12, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(2,BigDecimal.ROUND_HALF_EVEN).doubleValue()==315.12);
    }

    @Test
	public void test5HloMuuOmistus_2018() {
		EtuusAsia etuusAsia = testiAsiat.get5HloMuuOmistus_2018();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 1250.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(1250.0))==0);
        logger.info("Expected: 881.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==881.0);
    }

    @Test
	public void test2HloVuokrallaAsuva_2015() {
		EtuusAsia etuusAsia = testiAsiat.get2HloVuokrallaAsuva_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
 	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
		FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 735.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(735.0))==0);
        logger.info("Expected: 650.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().compareTo(new BigDecimal(650.0))==0);
    }

    @Test
	public void testYksinVuokrallaAsuvaVammainen_2015() {
		EtuusAsia etuusAsia = testiAsiat.getYksinVuokrallaAsuvaVammainen_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
	    FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
        logger.info("Expected: 735.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(735.0))==0);
        logger.info("Expected: 667.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().compareTo(new BigDecimal(667.0))==0);
    }

    @Test
	public void test2VuokrallaAsuvaaVammaista_2015() {
		EtuusAsia etuusAsia = testiAsiat.get2VuokrallaAsuvaaVammaista_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
	    FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
	    // 2 hengen osalta Hki max 735, mutta  lisätilan tarvetta => 3 hlö osalta maksimi eli 937
        logger.info("Expected: 937.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(937.0))==0);
        logger.info("Expected: 697.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        // Hyväksytyt asumismenot
        // Vuokra 620 €
        // Vesi 2 x 17 = 34€ (kustannukset 19, hyväksytään vain 17)
        // Lämmitys 30 + 13 = 43€ (kustannukset huomioidaan pyydetyllä tasolla)
        // Yhteensä 697€
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==697.0);
    }

    @Test
	public void test3VuokrallaAsuvaaVammaista_2015() {
		EtuusAsia etuusAsia = testiAsiat.get3VuokrallaAsuvaaVammaista_2015();
		insertHakemusObjectsIntoSession(sessionStateful, etuusAsia);
	    sessionStateful.startProcess("housingCostsProcess");	
        sessionStateful.fireAllRules();
	    FraasienAvaaja.avaaPaatos(etuusAsia.getRatkaisuTiedot().getFraasit(), etuusAsia.getAsiakas().getKieli());
	    // 2 hengen osalta Hki max 735, mutta  lisätilan tarvetta => 3 hlö osalta maksimi eli 937
        logger.info("Expected: 1095.0, got:"+etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur());
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getEnimmaisAsumisMenotEur().compareTo(new BigDecimal(1095.0))==0);
        logger.info("Expected: 697.0, got:"+etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN));
        // Hyväksytyt asumismenot
        // Vuokra 620 €
        // Vesi 3 x 17 = 51€ (kustannukset 19, hyväksytään vain 17)
        // Lämmitys 30 + 2*13 = 56€ 
        // Yhteensä 727€
        Assert.assertTrue(etuusAsia.getRatkaisuTiedot().getHyvaksytytAsumismenotEur().setScale(1,BigDecimal.ROUND_HALF_EVEN).doubleValue()==727.0);
    }
    
    private void insertHakemusObjectsIntoSession(KieSession session, EtuusAsia etuusAsia) {
    	session.insert(etuusAsia);
    	session.insert(etuusAsia.getAsiakas());
    	if(etuusAsia.getAsiakas().getAsiakkaanTyyppi() == AsiakkaanTyyppi.HENKILO_ASIAKAS) {
    		session.insert(etuusAsia.getAsiakas().getHenkiloAsiakas());
    	} else if (etuusAsia.getAsiakas().getAsiakkaanTyyppi() == AsiakkaanTyyppi.TYONANTAJA_ASIAKAS) {
    		// This we don't have yet...
    	}
    	for(RuokakunnanJasen jasen:etuusAsia.getPerusteTiedot().getRuokakunnanJasenet()) {
    		session.insert(jasen);
    	}
    	session.insert(etuusAsia.getPerusteTiedot());
    	session.insert(etuusAsia.getPerusteTiedot().getAsuntoTiedot());
    	session.insert(etuusAsia.getRatkaisuTiedot());
    }

    /*
     * Uncomment this to see the rules resulting from the decision table
     * You probably need to change to file name to reflect your setup. 
     * Sorry about that.
    @Test
    public void testCompile() {
    		  File dtf = new File( "X:\\Workspace\\Photon_maven_utf8_rule_workspace\\DroolsHousingBenefit\\src\\main\\resources\\rules\\MaxAsumisMenot.xls" );
    		  InputStream is;
    		  try {
    		    is = new FileInputStream( dtf );
    		    SpreadsheetCompiler ssComp = new SpreadsheetCompiler();
    		    String s = ssComp.compile( is, InputType.XLS );
    		    System.out.println( "=== Begin generated DRL ===" );
    		    System.out.println( s );
    		    System.out.println( "=== End generated DRL ===" );
    		  } catch (IOException e) {
    		    // TODO Auto-generated catch block
    		    e.printStackTrace();
    		  }
    }
    */
}
