package se.lia.template;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TypeParserTest.class,
				GrundOchMarginalParserTest.class,
				GrundOchMarginalEntityDAOTest.class, 
				ParserFactoryTest.class,
				ParserTest.class, 
				FileLoaderTest.class,
				AldersInverkanParserTest.class})
public class AllTests 
{
	
}
