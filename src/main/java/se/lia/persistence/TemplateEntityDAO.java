package se.lia.persistence;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import se.lia.model.TemplateEntity;

public class TemplateEntityDAO {

	private static TemplateEntityDAO instance;
	private EntityManager em;
	
	private TemplateEntityDAO() {
		super();
		this.em = DBManager.getEntityManager();
	}
	
	/**
	 * Singleton getter
	 * @return
	 */
	public synchronized static TemplateEntityDAO getInstance(){
		if(instance == null){
				instance = new TemplateEntityDAO();
		}
		return instance;
	}

	/**
	 * Will do an database lookup for an templateEntity with provided id
	 * @param id
	 * @return
	 */
	public TemplateEntity getById(Long id){
		Query q = em.createQuery("select t from TemplateEntity t where t.id = :id");
		q.setParameter("id", id);
		return (TemplateEntity)q.getSingleResult();
	}
	
	
	/**
	 * Saves an entity
	 * @param e the entity to save
	 */
	public TemplateEntity save(TemplateEntity e){
		em.getTransaction().begin();
		if(e.getId() != null){
			return em.merge(e);
		} else{
			em.persist(e);
		}
		em.getTransaction().commit();
		return e;
	}
}
