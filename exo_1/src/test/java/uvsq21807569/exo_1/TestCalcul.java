package uvsq21807569.exo_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalcul {

	@Test
	public void test() {
		Employe a = new Employe("a","b",10,2);
		CalculSalaire c=new CalculSalaire();
		assertTrue(c.calcul(a)==20);
	}

}
