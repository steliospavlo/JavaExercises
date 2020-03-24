
package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculationTest {
    private Calculation calc;
    
    public CalculationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculation();
    }
    
    @Test
    public void testGetSumValid() {
        int result = calc.getSum(2, 2);
        assertEquals(4, result);
    }
    
    @Test
    public void testDivisionNotValid() {
        int result = calc.getSum(2, 2);
        assertNotEquals(5, result);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        calc.division(4, 2);
    }
    
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroNumber() {
        calc.division(4, 0);
    }
    
    @Test
    public void testDivisionNegativeNumber(){
        double result = calc.division(-4, 2);
        assertTrue(result < 0);
    }
    
    @Test
    public void testDivisionPositiveNumber(){
        double result = calc.division(-4, -2);
        assertTrue(result > 0);
    }
    
    @Test
    public void testSumOfArrayValid(){
        int [] array = {2, 4, 8};
        int sum = calc.sumOfArray(array);
        assertEquals(14, sum);
    }
    
    @Test
    public void testSumOfArrayNotValid(){
        int [] array = {2, 4, 8};
        int sum = calc.sumOfArray(array);
        assertNotEquals(14, sum);
    }
    
    
    @Test
    public void testMultiply(){
        int [] array = {2, 5, 10, 3};
        int num = 10;
        calc.multiply(array, num);
        int [] arrayExpected = {20, 50, 100, 30};
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        assertArrayEquals(arrayExpected, array);
        
    }
}
