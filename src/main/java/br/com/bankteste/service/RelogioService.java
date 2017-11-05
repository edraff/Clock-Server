package br.com.bankteste.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.bankteste.Convert.RelogioConvert;
import br.com.bankteste.Facade.RelogioFacade;
import br.com.bankteste.entity.Relogio;


// TODO: Auto-generated Javadoc
/**
 * The Class RelogioService.
 */
@Path("/clock")
public class RelogioService {
	
	/** The relogio facade. */
	private RelogioFacade relogioFacade = new RelogioFacade() ;
	
	/**
	 * Buscar.
	 *
	 * @param horas the horas
	 * @param minutos the minutos
	 * @return the relogio
	 */
	@GET 
	@Path("/{horas}/{minutos}")
	@Produces("application/json")
	public Response buscar(@PathParam("horas") int horas,
			@PathParam("minutos") int minutos){
		Relogio relogioRetorno = relogioFacade.buscar(
				RelogioConvert.convertToEntity(horas,minutos)) ; 
		
	 return Response.status(200).entity(relogioRetorno).build();
	}
	

}
