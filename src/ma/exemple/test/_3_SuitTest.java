package ma.exemple.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Combiner en une suite de tests
// Exécution d'une suite de tests va exécuter toutes les classes de test dans cette suite dans l'ordre spécifié
@RunWith(Suite.class)
@SuiteClasses({ _1_FirstTest.class, _2_SecondeTest.class })
public class _3_SuitTest {

	@BeforeClass // S'exécute avant toute les methodes du teste (Il est utilisé pour effectuer des activités de temps intensive)
	public static void shouldBeExecutedBeforeAll() {
		String string = "+ should Be Executed Before All";
		System.out.println(string);
		assertNotNull(string);
	}

	@AfterClass // S'exécute aprés l'exécution de toute les méthodes du teste (Il est utilisé pour effectuer des activités de temps intensive)
	public static void shouldBeExecutedAfterAll() {
		System.out.println("+ should Be Executed After All");
		assertTrue(true);
	}

}