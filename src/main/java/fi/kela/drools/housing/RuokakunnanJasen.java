package fi.kela.drools.housing;

import fi.kela.drools.general.Henkilo;

public class RuokakunnanJasen extends Henkilo {
	private boolean lisatilanTarve = false;
	
	public boolean isLisatilanTarve() {
		return lisatilanTarve;
	}
	public void setLisatilanTarve(boolean lisatilanTarve) {
		this.lisatilanTarve = lisatilanTarve;
	}

}
