package br.com.bankteste.business;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import br.com.bankteste.DAO.RelogioDAO;
import br.com.bankteste.entity.Relogio;

public class RelogioBusiness {

	/** The relogio DAO. */
	private RelogioDAO relogioDAO = new RelogioDAO() ;
	
	/**
	 * Buscar.
	 *
	 * @param relogio the relogio
	 * @return the relogio
	 */
	public Relogio buscar(Relogio relogio) {
		// TODO Auto-generated method stub
		Relogio relogioRetorno = relogioDAO.buscar(relogio);
		
		   if (relogioRetorno==null) {
			   calculaAngulo(relogio);
			   relogioRetorno = relogioDAO.criarRelogio(relogio);
		       }
		   
		return relogioRetorno;
	}
	
	private void calculaAngulo(Relogio relogio) {
		
		int resultado = Math.abs(calculaAnguloH(relogio.getIdentificador()
				.getHoras()) - calculaAnguloM(relogio.getIdentificador().getMinutos()));
		if (resultado>180) {
			resultado = 360-resultado;
		}
		relogio.setAngulo(resultado);
	}
	
	private int calculaAnguloH(int horas) {
		return (horas%12)*30;
	}
	
	private int calculaAnguloM(int minutos) {
		return (minutos%60)*6;
	}


}
