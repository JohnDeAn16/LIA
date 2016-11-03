package se.lia.template;

import java.io.File;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import se.lia.model.GrundOchMarginalEntity;
import se.lia.model.PrimitiveGrundOchMarginalEntity;
import se.lia.persistence.DBManager;
import se.lia.persistence.PrimitiveGrundOchMarginalEntityDAO;

public class LiaTemplate {

	public static void main(String[] args) 
	{
		LiaTemplate.clean();
		
		DBManager.getEntityManager();
		DocParser docParser = new DocParser(new File("XMLUnderlag/Doc.xml"));
		ArrayList<String> gomFileNames = docParser.getTypeFileNames("GrundOchMarginal");
		GrundMarginalParser gomParser = new GrundMarginalParser();
		PrimitiveGrundOchMarginalEntityDAO dao = 
				PrimitiveGrundOchMarginalEntityDAO.getInstance();
		GrundOchMarginalEntity[] gomEntity;
		
		for(int i = 0; i < gomFileNames.size(); i++)
		{
			gomEntity = gomParser.makeEntity(new File("XMLUnderlag/" + gomFileNames.get(i)));
			if(gomEntity != null)
			{
				for(int k = 0; k < gomEntity.length; k++)
				{
					PrimitiveGrundOchMarginalEntity p = gomParser.buildEntity(gomEntity[k]);
					dao.save(p);
					
					System.out.println(dao.getById(p.getId()).toString());
				}
			}
		}
	}
	
	public static void clean()
	{
		EntityManager em = DBManager.getEntityManager();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM PrimitiveGrundOchMarginalEntity e").executeUpdate();
		em.getTransaction().commit();
	}
}
