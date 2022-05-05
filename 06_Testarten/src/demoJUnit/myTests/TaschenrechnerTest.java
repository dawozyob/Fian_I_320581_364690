package demoJUnit.myTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demoJUnit.myClasses.Taschenrechner;

class TaschenrechnerTest {
	private Taschenrechner taschenrechner;
	
	@BeforeEach
	public void setUp() {
		System.out.println("Initialisiere Taschenrechner");
		this.taschenrechner = new Taschenrechner();
	}
	
	@Test
	public void testMultiply() {
		assertEquals("Normales Multiplizieren muss klappen", 10, this.taschenrechner.multipliziere(2, 10));
	}
	

}
