package fi.kela.drools.housing;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YlatTiedot {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	public static Date YLAT_2015_ALKU;
	public static Date YLAT_2018_ALKU;
	public static Date LOPPU;
	
	public static BigDecimal MAX_VESIMAKSU_HLO_KK_2015 = new BigDecimal(17.0);
	public static BigDecimal MAX_LAMMITYS_KK_2015 = new BigDecimal(38.0);
	public static BigDecimal LAMMITYS_LISAHLO_KK_2015 = new BigDecimal(13.0);

	public static BigDecimal MAX_VESIMAKSU_HLO_KK_2018 = new BigDecimal(18.0);
	public static BigDecimal MAX_LAMMITYS_KK_2018 = new BigDecimal(39.0);
	public static BigDecimal LAMMITYS_LISAHLO_KK_2018 = new BigDecimal(14.0);

	public static BigDecimal RAHOITUSMENOT_KORVATTAVA_OSUUS_2015 = new BigDecimal(0.73);

	public static BigDecimal HOITOMENO_1HLO_2015 = new BigDecimal(89);
	public static BigDecimal HOITOMENO_2HLO_2015 = new BigDecimal(107);
	public static BigDecimal HOITOMENO_3HLO_2015 = new BigDecimal(135);
	public static BigDecimal HOITOMENO_4HLO_2015 = new BigDecimal(159);
	public static BigDecimal HOITOMENO_YLI4HLO_2015 = new BigDecimal(49);

	public static BigDecimal HOITOMENO_1HLO_2018 = new BigDecimal(96);
	public static BigDecimal HOITOMENO_2HLO_2018 = new BigDecimal(115);
	public static BigDecimal HOITOMENO_3HLO_2018 = new BigDecimal(145);
	public static BigDecimal HOITOMENO_4HLO_2018 = new BigDecimal(171);
	public static BigDecimal HOITOMENO_YLI4HLO_2018 = new BigDecimal(53);

	public static BigDecimal KUSTANNUS_KOROTUS_POHJOINEN_2015 = new BigDecimal(0.08);
	public static BigDecimal KUSTANNUS_KOROTUS_ITA_2015 = new BigDecimal(0.04);

	public static BigDecimal MAX_HOITOMENOT_OSUUS_2015 = new BigDecimal(0.30);
	public static BigDecimal MAX_RAHOITUSMENOT_OSUUS_2015 = new BigDecimal(0.70);

	public static String MAX_VESIMAKSU_HLO_KK = "MaxVesimaksuHloKk";
	public static String MAX_LAMMITYS_KK = "MaxLammitysKk";
	public static String LAMMITYS_LISAHLO_KK = "LammitysLisahloKk";
	public static String RAHOITUSMENOT_KORVATTAVA_OSUUS = "RahoitusmenotOsuus";
	public static String HOITOMENO_1HLO = "Hoitomeno1Hlo";
	public static String HOITOMENO_2HLO = "Hoitomeno2Hlo";
	public static String HOITOMENO_3HLO = "Hoitomeno3Hlo";
	public static String HOITOMENO_4HLO = "Hoitomeno4Hlo";
	public static String HOITOMENO_YLI4HLO = "HoitomenoYli4Hlo";
	public static String KUSTANNUS_KOROTUS_POHJOINEN = "KustannusKorotusPohjoinen";
	public static String KUSTANNUS_KOROTUS_ITA = "KustannusKorotusKeski";
	public static String MAX_HOITOMENOT_OSUUS = "MaxHoitoMenotOsuus";
	public static String MAX_RAHOITUSMENOT_OSUUS = "MaxRahoitusMenotOsuus";
	
	static {
		try {
			YLAT_2015_ALKU = sdf.parse("01.01.2015");
			YLAT_2018_ALKU = sdf.parse("01.01.2018");
			LOPPU = sdf.parse("31.12.2099");
		} catch(ParseException pe) {
			YLAT_2015_ALKU = null;
			YLAT_2018_ALKU = null;
			LOPPU = null;
		}
	}

	// Well, this is crappy and needs to replaced by something sensible
	public static BigDecimal getOhjausTietoBigDecimal(String tieto, Date alkuPvm) {
		BigDecimal arvo = new BigDecimal(0);
		if(tieto.equals(MAX_VESIMAKSU_HLO_KK)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  MAX_VESIMAKSU_HLO_KK_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = MAX_VESIMAKSU_HLO_KK_2018;
		}
		if(tieto.equals(MAX_LAMMITYS_KK)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  MAX_LAMMITYS_KK_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = MAX_LAMMITYS_KK_2018;
		}
		if(tieto.equals(LAMMITYS_LISAHLO_KK)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  LAMMITYS_LISAHLO_KK_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = LAMMITYS_LISAHLO_KK_2018;
		}
		if(tieto.equals(HOITOMENO_1HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  HOITOMENO_1HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = HOITOMENO_1HLO_2018;
		}
		if(tieto.equals(HOITOMENO_2HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  HOITOMENO_2HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = HOITOMENO_2HLO_2018;
		}
		if(tieto.equals(HOITOMENO_3HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  HOITOMENO_3HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = HOITOMENO_3HLO_2018;
		}
		if(tieto.equals(HOITOMENO_4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  HOITOMENO_4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = HOITOMENO_4HLO_2018;
		}
		if(tieto.equals(HOITOMENO_YLI4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  HOITOMENO_YLI4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = HOITOMENO_YLI4HLO_2018;
		}
		if(tieto.equals(RAHOITUSMENOT_KORVATTAVA_OSUUS)) {
	    	arvo =  RAHOITUSMENOT_KORVATTAVA_OSUUS_2015;
		}
		if(tieto.equals(KUSTANNUS_KOROTUS_POHJOINEN)) {
	    	arvo =  KUSTANNUS_KOROTUS_POHJOINEN_2015;
		}
		if(tieto.equals(KUSTANNUS_KOROTUS_ITA)) {
	    	arvo =  KUSTANNUS_KOROTUS_ITA_2015;
		}
		if(tieto.equals(MAX_HOITOMENOT_OSUUS)) {
	    	arvo =  MAX_HOITOMENOT_OSUUS_2015;
		}
		if(tieto.equals(MAX_RAHOITUSMENOT_OSUUS)) {
	    	arvo =  MAX_RAHOITUSMENOT_OSUUS_2015;
		}
	
		return arvo;
	}
}
