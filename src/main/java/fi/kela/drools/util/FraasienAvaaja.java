package fi.kela.drools.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fi.kela.drools.housing.Fraasi;
import fi.kela.drools.housing.Kieli;
import fi.kela.drools.housing.PaatoksenFraasi;

/*
 * Tämä luokka avaa fraasit ja muuttujat halutulla kielellä tekstiksi.
 * Käytännössä nämä toki hallittaisiin Fraasirekisterissä.
 * Tämä luokka on vain kehittämisen apu.
 * Lähtökohtana on, että fraasista tiedetään koodi, kieli ja muuttujien arvot merkkijonona.
 */
public class FraasienAvaaja {

	static Logger logger = LoggerFactory.getLogger(FraasienAvaaja.class);
	public static void avaaPaatos(List<PaatoksenFraasi> fraasit, Kieli kieli) {
		logger.info("############################# Päätöksen fraasit alkavat #####################################");
		for(PaatoksenFraasi paatosFraasi:fraasit) {
			Fraasi fraasi = paatosFraasi.getFraasi();
			String fraasiTeksti = fraasi.getFraasiTeksti();
			for(int i=0;i<fraasi.getMuuttujienMaara();i++) {
				String korvattava = "$"+(i+1);
				fraasiTeksti = fraasiTeksti.replace(korvattava, paatosFraasi.getMuuttujat().get(i));
			}
			logger.info(fraasiTeksti);
		}
		logger.info("############################# Päätöksen fraasit päättyvät #####################################");
	}
}
