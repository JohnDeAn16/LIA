package se.lia.template;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import se.lia.model.TestEntity;

public class LiaTemplate {
	private static final String PERSISTENCE_UNIT_NAME = "LiaTemplate";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
		// read the existing entries and write to console
		Query q = em.createQuery("select t from TestEntity t");
		List<TestEntity> entities = q.getResultList();
		for (TestEntity entity : entities) {
			System.out.println(entity);
		}
		System.out.println("Size: " + entities.size());

		// create new ntity and save it
		em.getTransaction().begin();
		TestEntity entity = new TestEntity();
		
		em.persist(entity);
		em.getTransaction().commit();

		em.close();
	}
}
