package se.lia.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
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
	private static final String USER_PROPERTIES_FILE = "META-INF/user.properties";
	private static EntityManager em;
	
	public static synchronized EntityManager getEntityManager(){
		if(em == null){
		
			ResourceBundle rb = readProperties();
			if(rb!=null){
				Properties props = new Properties();
				Enumeration<String> keys = rb.getKeys();
				while(keys.hasMoreElements()){
					String element = keys.nextElement();
					props.put(element, rb.getString(element));
				}
				EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT, props);
				em = managerFactory.createEntityManager();
			}
		}
		
		return em;
	}

	/**
	 * Will return properties if a user.properties file is found on classpath
	 * @return
	 */
	private static ResourceBundle readProperties() {
		ResourceBundle prop = null;
		InputStream is = null;
		try{
			if(is == null){
				System.out.println("Could not load properties file " + USER_PROPERTIES_FILE);
			} else{
			}
			prop = ResourceBundle.getBundle("se.lia.template.user");
		} finally{
			if(is != null){
				try{
					is.close();
				}catch (IOException e) {
					// Noting to do, could not close stream.
				}
			}
		}
		return prop;
	}


}
