package io.github.grzegul.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysCompareTest.class, ParametrizedFirstAndLastTest.class, ParametrizedStringHelperTest.class })
public class AllTests {

}
