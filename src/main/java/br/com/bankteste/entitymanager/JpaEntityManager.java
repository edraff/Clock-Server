package br.com.bankteste.entitymanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaEntityManager {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("DB_mysql");
	private EntityManager em = factory.createEntityManager();

	public EntityManager getEntityManager() {
		return em;
	}
}
