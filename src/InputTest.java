import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {
	Student jimin;
	
	@Before
	public void init() {
		jimin = new Student();
	}
	@Ignore @Test
	public void testInput() {
		
		Input input = new Input();
		input.input(jimin);
		assertEquals("한지민", jimin.name);
	}
	
	@Test
	public void testCalc() {
		Calc calc = new Calc();
		jimin.kor = 100; jimin.eng = 90; jimin.mat = 80;
		calc.calc(jimin);
//		assertEquals(270, jimin.tot);
//		assertEquals((int)(270/3.),(int) jimin.avg);
		assertEquals('B', jimin.grade);
	} 
	
}
