package ma.exemple.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Combiner en une suite de tests
// Ex�cution d'une suite de tests va ex�cuter toutes les classes de test dans cette suite dans l'ordre sp�cifi�
@RunWith(Suite.class)
@SuiteClasses({ _1_FirstTest.class, _2_SecondeTest.class })
public class _3_SuitTest {

	@BeforeClass // S'ex�cute avant toute les methodes du teste (Il est utilis� pour effectuer des activit�s de temps intensive)
	public static void shouldBeExecutedBeforeAll() {
		String string = "+ should Be Executed Before All";
		System.out.println(string);
		assertNotNull(string);
	}

	@AfterClass // S'ex�cute apr�s l'ex�cution de toute les m�thodes du teste (Il est utilis� pour effectuer des activit�s de temps intensive)
	public static void shouldBeExecutedAfterAll() {
		System.out.println("+ should Be Executed After All");
		assertTrue(true);
	}

}