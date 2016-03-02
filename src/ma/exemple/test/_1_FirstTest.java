package ma.exemple.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Régle de nomage : CLASSE  - Nom de la classe de teste + le mot "Test" -> PersonTest, CampagnTest
// Régle de nomage : METHODE - C'est préféreable d'ajouter "SHOULD" -> ordersShouldBeCreated , menuShouldGetActive
public class _1_FirstTest {

	@Test
	public void valueShouldBeAdd() {
		System.out.println(" * value Should Be Add");
		int huit = 4 + 4;
		assertEquals("8 = 8", 8, huit);
	}
}
