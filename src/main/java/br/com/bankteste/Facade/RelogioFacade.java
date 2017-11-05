package br.com.bankteste.Facade;

import br.com.bankteste.business.RelogioBusiness;
import br.com.bankteste.entity.Relogio;

public class RelogioFacade {

	/** The relogio business. */
	private RelogioBusiness relogioBusiness = new RelogioBusiness() ;
	
	/**
	 * Buscar.
	 *
	 * @param relogio the relogio
	 * @return the relogio
	 */
	public Relogio buscar(Relogio relogio) {
		// TODO Auto-generated method stub
		return relogioBusiness.buscar(relogio);
	}

}
