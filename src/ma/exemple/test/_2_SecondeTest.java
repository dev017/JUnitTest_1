package ma.exemple.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class _2_SecondeTest {

	@Test(timeout = 100) // Le teste echoue s'il s'exécute dans plus de 100ms -> Donner un interval d'excution
	@Ignore("Ne pas exécuter ce teste") // Permet d'annuler le teste de cette méthode
	public void valueShouldBeInitilized() {
		System.out.println("- value Should Be Initilized");
		int a = 0;
		assertEquals("0 = 0", 0, a);
	}

	@Test(expected = ArithmeticException.class) // Si l'exception ArithmeticException est lancé (c'est le cas -> 5/0) le teste est réussit
	public void methodShouldBeGenerateException() {
		System.out.println("- method Should Be Generate Exception");
		float a = 5 / 0;
		System.out.println("a = " + a);
	}

	@Before // S'execute avant chaque teste dans la classe des teste
	public void shouldBeExecutedBeforeAllMethod() {
		System.out.println("- should Be Executed Before All Method of this class test");
		assertFalse(false);
	}

	@After // S'execute après chaque teste dans la classe des teste
	public void shouldBeExecutedAfterAllMethod() {
		System.out.println("- should Be Executed After All Method of this class test");
	}
}
