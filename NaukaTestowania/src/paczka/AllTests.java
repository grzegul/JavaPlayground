package paczka;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestJunit3Assert.class, TestJunit4Case.class, TestJunit5Result.class })

public class AllTests {

}
