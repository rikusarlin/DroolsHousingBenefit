package fi.kela.drools.housing;

import java.math.BigDecimal;
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
	
	public static BigDecimal ENIMMAISMENOT_RYHMA1_1HLO_2015 = new BigDecimal(508);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_2HLO_2015 = new BigDecimal(735);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_3HLO_2015 = new BigDecimal(937);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_4HLO_2015 = new BigDecimal(1095);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_YLI4PERHLO_2015 = new BigDecimal(137);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_1HLO_2018 = new BigDecimal(516);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_2HLO_2018 = new BigDecimal(746);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_3HLO_2018 = new BigDecimal(951);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_4HLO_2018 = new BigDecimal(1111);
	public static BigDecimal ENIMMAISMENOT_RYHMA1_YLI4PERHLO_2018 = new BigDecimal(139);

	public static BigDecimal ENIMMAISMENOT_RYHMA2_1HLO_2015 = new BigDecimal(492);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_2HLO_2015 = new BigDecimal(706);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_3HLO_2015 = new BigDecimal(890);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_4HLO_2015 = new BigDecimal(1038);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_YLI4PERHLO_2015 = new BigDecimal(130);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_1HLO_2018 = new BigDecimal(499);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_2HLO_2018 = new BigDecimal(717);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_3HLO_2018 = new BigDecimal(903);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_4HLO_2018 = new BigDecimal(1054);
	public static BigDecimal ENIMMAISMENOT_RYHMA2_YLI4PERHLO_2018 = new BigDecimal(132);

	public static BigDecimal ENIMMAISMENOT_RYHMA3_1HLO_2015 = new BigDecimal(411);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_2HLO_2015 = new BigDecimal(600);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_3HLO_2015 = new BigDecimal(761);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_4HLO_2015 = new BigDecimal(901);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_YLI4PERHLO_2015 = new BigDecimal(123);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_1HLO_2018 = new BigDecimal(396);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_2HLO_2018 = new BigDecimal(579);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_3HLO_2018 = new BigDecimal(734);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_4HLO_2018 = new BigDecimal(869);
	public static BigDecimal ENIMMAISMENOT_RYHMA3_YLI4PERHLO_2018 = new BigDecimal(119);

	public static BigDecimal ENIMMAISMENOT_RYHMA4_1HLO_2015 = new BigDecimal(362);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_2HLO_2015 = new BigDecimal(527);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_3HLO_2015 = new BigDecimal(675);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_4HLO_2015 = new BigDecimal(804);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_YLI4PERHLO_2015 = new BigDecimal(118);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_1HLO_2018 = new BigDecimal(349);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_2HLO_2018 = new BigDecimal(509);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_3HLO_2018 = new BigDecimal(651);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_4HLO_2018 = new BigDecimal(755);
	public static BigDecimal ENIMMAISMENOT_RYHMA4_YLI4PERHLO_2018 = new BigDecimal(114);

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
	public static String ENIMMAISMENOT_RYHMA1_1HLO = "EnimmaisMenot_Ryhma1_1";
	public static String ENIMMAISMENOT_RYHMA1_2HLO = "EnimmaisMenot_Ryhma1_2";
	public static String ENIMMAISMENOT_RYHMA1_3HLO = "EnimmaisMenot_Ryhma1_3";
	public static String ENIMMAISMENOT_RYHMA1_4HLO = "EnimmaisMenot_Ryhma1_4";
	public static String ENIMMAISMENOT_RYHMA1_YLI4PERHLO = "EnimmaisMenot_Ryhma1_N";
	public static String ENIMMAISMENOT_RYHMA2_1HLO = "EnimmaisMenot_Ryhma2_1";
	public static String ENIMMAISMENOT_RYHMA2_2HLO = "EnimmaisMenot_Ryhma2_2";
	public static String ENIMMAISMENOT_RYHMA2_3HLO = "EnimmaisMenot_Ryhma2_3";
	public static String ENIMMAISMENOT_RYHMA2_4HLO = "EnimmaisMenot_Ryhma2_4";
	public static String ENIMMAISMENOT_RYHMA2_YLI4PERHLO = "EnimmaisMenot_Ryhma2_N";
	public static String ENIMMAISMENOT_RYHMA3_1HLO = "EnimmaisMenot_Ryhma3_1";
	public static String ENIMMAISMENOT_RYHMA3_2HLO = "EnimmaisMenot_Ryhma3_2";
	public static String ENIMMAISMENOT_RYHMA3_3HLO = "EnimmaisMenot_Ryhma3_3";
	public static String ENIMMAISMENOT_RYHMA3_4HLO = "EnimmaisMenot_Ryhma3_4";
	public static String ENIMMAISMENOT_RYHMA3_YLI4PERHLO = "EnimmaisMenot_Ryhma3_N";
	public static String ENIMMAISMENOT_RYHMA4_1HLO = "EnimmaisMenot_Ryhma4_1";
	public static String ENIMMAISMENOT_RYHMA4_2HLO = "EnimmaisMenot_Ryhma4_2";
	public static String ENIMMAISMENOT_RYHMA4_3HLO = "EnimmaisMenot_Ryhma4_3";
	public static String ENIMMAISMENOT_RYHMA4_4HLO = "EnimmaisMenot_Ryhma4_4";
	public static String ENIMMAISMENOT_RYHMA4_YLI4PERHLO = "EnimmaisMenot_Ryhma4_N";
	
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
		
		if(tieto.equals(ENIMMAISMENOT_RYHMA1_1HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA1_1HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA1_1HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA1_2HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA1_2HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA1_2HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA1_3HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA1_3HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA1_3HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA1_4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA1_4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA1_4HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA1_YLI4PERHLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA1_YLI4PERHLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA1_YLI4PERHLO_2018;
		}

		if(tieto.equals(ENIMMAISMENOT_RYHMA2_1HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA2_1HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA2_1HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA2_2HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA2_2HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA2_2HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA2_3HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA2_3HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA2_3HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA2_4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA2_4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA2_4HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA2_YLI4PERHLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA2_YLI4PERHLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA2_YLI4PERHLO_2018;
		}

		if(tieto.equals(ENIMMAISMENOT_RYHMA3_1HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA3_1HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA3_1HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA3_2HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA3_2HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA3_2HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA3_3HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA3_3HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA3_3HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA3_4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA3_4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA3_4HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA3_YLI4PERHLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA3_YLI4PERHLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA3_YLI4PERHLO_2018;
		}

		if(tieto.equals(ENIMMAISMENOT_RYHMA4_1HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA4_1HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA4_1HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA4_2HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA4_2HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA4_2HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA4_3HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA4_3HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA4_3HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA4_4HLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA4_4HLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA4_4HLO_2018;
		}
		if(tieto.equals(ENIMMAISMENOT_RYHMA4_YLI4PERHLO)) {
		    if(alkuPvm.after(YLAT_2015_ALKU) && alkuPvm.before(YLAT_2018_ALKU)) {
		    	arvo =  ENIMMAISMENOT_RYHMA4_YLI4PERHLO_2015;
		    } else if (alkuPvm.after(YLAT_2018_ALKU) && alkuPvm.before(LOPPU))
		    	arvo = ENIMMAISMENOT_RYHMA4_YLI4PERHLO_2018;
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
