package br.com.bankteste.DAO;

import javax.persistence.EntityManager;
import javax.ws.rs.WebApplicationException;

import br.com.bankteste.entity.Relogio;
import br.com.bankteste.entitymanager.JpaEntityManager;

public class RelogioDAO {
	private JpaEntityManager JPAEM = new JpaEntityManager();
	private EntityManager objEM = JPAEM.getEntityManager(); 
	
	public Relogio buscar(Relogio relogio) {
		try {
			
			Relogio cliente = objEM.find(Relogio.class, relogio.getIdentificador()); 
			objEM.close();  
			return cliente;  
			} catch (Exception e) { 
			throw new WebApplicationException(500);
			 }
	}
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
