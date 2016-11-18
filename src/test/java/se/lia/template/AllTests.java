package se.lia.template;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DocParserTest.class,
				GrundOchMarginalParserTest.class,
				GrundOchMarginalEntityDAOTest.class, 
				ParserFactoryTest.class,
				ParserTest.class})
public class AllTests 
{
	
}
