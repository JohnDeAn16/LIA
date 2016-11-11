package se.lia.persistence;

import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Utility class for getting an instance of EntityManager
 * @author joel
 *
 */
public class DBManager {
	
	private static final String PERSISTENCE_UNIT = "LiaTemplate";
	private static EntityManager em;
	
	public static synchronized EntityManager getEntityManager(){
		if(em == null){
			EntityManagerFactory managerFactory;
			ResourceBundle rb = readProperties();
			if(rb!=null){
				Properties props = new Properties();
				Enumeration<String> keys = rb.getKeys();
				while(keys.hasMoreElements()){
					String element = keys.nextElement();
					props.put(element, rb.getString(element));
				}
				managerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT, props);
				
			} else {
				managerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			}
			em = managerFactory.createEntityManager();
		}
		
		return em;
	}

	/**
	 * Will return properties if a user.properties file is found on classpath
	 * @return
	 */
	private static ResourceBundle readProperties() {
		ResourceBundle prop = null;
		try{
			prop = ResourceBundle.getBundle("se.lia.template.user");
		} catch (MissingResourceException e){
			System.out.println("Could not find user.properties file");
		}
		return prop;
	}


}
