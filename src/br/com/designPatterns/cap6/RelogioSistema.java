package br.com.designPatterns.cap6;

import java.util.Calendar;

public class RelogioSistema implements Relogio {
	
	/* (non-Javadoc)
	 * @see br.com.designPatterns.cap6.RelogioGenerico#hoje()
	 */
	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}
