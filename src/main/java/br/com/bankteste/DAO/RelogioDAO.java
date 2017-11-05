package br.com.bankteste.DAO;

import javax.persistence.EntityManager;
import javax.ws.rs.WebApplicationException;

import br.com.bankteste.entity.Relogio;
import br.com.bankteste.entitymanager.JpaEntityManager;

public class RelogioDAO {
	
	/** The jpaem. */
	private JpaEntityManager JPAEM = new JpaEntityManager();
	
	/** The obj EM. */
	private EntityManager objEM = JPAEM.getEntityManager(); 
	
	/**
	 * Buscar.
	 *
	 * @param relogio the relogio
	 * @return the relogio
	 */
	public Relogio buscar(Relogio relogio) {
		try {
			
			Relogio cliente = objEM.find(Relogio.class, relogio.getIdentificador()); 
			objEM.close();  
			return cliente;  
			} catch (Exception e) { 
			throw new WebApplicationException(500);
			 }
	}
	
	/**
	 * Criar relogio.
	 *
	 * @param relogio the relogio
	 * @return the relogio
	 */
	public Relogio criarRelogio(Relogio relogio) {
		try {  
			JPAEM = new JpaEntityManager();
			objEM = JPAEM.getEntityManager(); 
			objEM.getTransaction().begin();   
			objEM.persist(relogio);   
			 objEM.getTransaction().commit();   
			objEM.close();   
			return relogio;  

			} catch (Exception e) {  
				e.printStackTrace();
			  throw new WebApplicationException(500);  
			}     
	}
	

}
