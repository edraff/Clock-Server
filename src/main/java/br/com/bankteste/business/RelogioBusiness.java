package br.com.bankteste.business;


import br.com.bankteste.DAO.RelogioDAO;
import br.com.bankteste.entity.Relogio;

// TODO: Auto-generated Javadoc
/**
 * The Class RelogioBusiness.
 */
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
	
	/**
	 * Calcula angulo.
	 *
	 * @param relogio the relogio
	 */
	private void calculaAngulo(Relogio relogio) {
		
		int resultado = Math.abs(calculaAnguloH(relogio.getIdentificador()
				.getHoras()) - calculaAnguloM(relogio.getIdentificador().getMinutos()));
		if (resultado>180) {
			resultado = 360-resultado;
		}
		relogio.setAngulo(resultado);
	}
	
	/**
	 * Calcula angulo H.
	 *
	 * @param horas the horas
	 * @return the int
	 */
	private int calculaAnguloH(int horas) {
		return (horas%12)*30;
	}
	
	/**
	 * Calcula angulo M.
	 *
	 * @param minutos the minutos
	 * @return the int
	 */
	private int calculaAnguloM(int minutos) {
		return (minutos%60)*6;
	}


}
