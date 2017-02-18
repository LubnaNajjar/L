import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

	View ViewToTest;
	Model ModelToTest;
	//Controller ContToTest;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		//this.ViewToTest = new View();
		//this.ModelToTest = new Model();
		
	}
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		//ViewToTest = null;
		//ModelToTest = null;
		//ContToTest = null;
	}
	
	
	
	@Before
	public void setUp() throws Exception {
		ViewToTest = new View();
		ModelToTest = new Model();
	}

	@After
	public void tearDown() throws Exception {
		ViewToTest = null;
		ModelToTest = null;
		//ContToTest = null;
	}

	
	@Test
	public void testAdd() {
		char operation='+';
		double FirstNumber = 1.0;
        double SecondNumber = 4.0;
        double ExpectedResult = 5.0;
        double ActualResult =  ModelToTest.calculate(FirstNumber, SecondNumber, operation);
        assertEquals(ExpectedResult, ActualResult, 0.0);
        
	}
	

	@Test
	public void testMinus() {
		char operation='-';
		double FirstNumber = 7.0;
        double SecondNumber = 3.0;
        double ExpectedResult = 4.0;
        double ActualResult =  ModelToTest.calculate(FirstNumber, SecondNumber, operation);
        assertEquals(ExpectedResult, ActualResult, 0.0);
       
	}
	
	@Test
	public void testMultiply() {
		char operation='*';
		double FirstNumber = 5.0;
        double SecondNumber = 2.0;
        double ExpectedResult = 10.0;
        double ActualResult =  ModelToTest.calculate(FirstNumber, SecondNumber, operation);
        assertEquals(ExpectedResult, ActualResult, 0.0);
       
	}
	
	

	@Test
	public void testMod() {
		char operation='%';
		double FirstNumber = 6.0;
        double SecondNumber = 5.0;
        double ExpectedResult = 1.0;
        double ActualResult =  ModelToTest.calculate(FirstNumber, SecondNumber, operation);
        assertEquals(ExpectedResult, ActualResult, 0.0);
       
	}

	@Test
	public void testNormalDivision() {
		char operation='/';
		double FirstNumber = 6.0;
        double SecondNumber = 3.0;
        double ExpectedResult = 2.0;
        double ActualResult =  ModelToTest.calculate(FirstNumber, SecondNumber, operation);
        assertEquals(ExpectedResult, ActualResult, 0.0);
         
	}

	
	@Test (expected=ArithmeticException.class)
    public void testDivisionByZero() {
           char operation='/';
   		   double FirstNumber = 6.0;
           double SecondNumber = 0.0;
           ModelToTest.calculate(FirstNumber, SecondNumber, operation);
           
    }
	
	@Test(expected=NumberFormatException.class)
	public void testGetFirstNumber() {
		 ViewToTest.getFN();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testGetSecondNumber() {
		 ViewToTest.getSN();
	}
	
}
