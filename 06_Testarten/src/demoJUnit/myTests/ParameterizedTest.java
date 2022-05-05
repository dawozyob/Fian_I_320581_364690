package demoJUnit.myTests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import demoJUnit.myClasses.Taschenrechner;

@RunWith(Parameterized.class)
class ParameterizedTest {
	
	@Parameter(0)
	public int p1;
	@Parameter(1)
	public int p2;
	@Parameter(2)
	public int result;
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{1,2,2},{5,3,15},{3,4,12}};
		data[0] = new Object[]{1,2,2};
		return Arrays.asList(data);
	}
	
	@Test
	public void testMultipliziere() {
		var tester = new Taschenrechner();
		assertEquals("Result", result, tester.multipliziere(p1, p2));
	}
	
	
}
