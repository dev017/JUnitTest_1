package ma.exemple.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Créer avec Eclispe : New -> Other -> JUnit -> JUnit Test Suite
// Faire appel au Suite des Test -> 3 ( Même résultat que : _3_SuitTest )
@RunWith(Suite.class)
@SuiteClasses({ _3_SuitTest.class })
public class _4_AllTests {

}
