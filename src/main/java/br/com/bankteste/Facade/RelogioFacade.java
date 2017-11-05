package br.com.bankteste.Facade;

import br.com.bankteste.business.RelogioBusiness;
import br.com.bankteste.entity.Relogio;

public class RelogioFacade {

	private RelogioBusiness relogioBusiness = new RelogioBusiness() ;
	
	public Relogio buscar(Relogio relogio) {
		// TODO Auto-generated method stub
		return relogioBusiness.buscar(relogio);
	}

}
