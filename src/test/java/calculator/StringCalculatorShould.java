package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	private static StringCalculator stringCalculator = new StringCalculator();
	
    @Test
    void empty_string_should_return_0() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
	public void testTwoNumbers(){
		assertEquals(3, stringCalculator.add("1,2"));
	}
    
    @Test
    public void unknownAmountOfNumbers(){
    	assertEquals(1+2+3+4+5+6+7,stringCalculator.add("1,2,3,4,5,6,7"));
    }
    
    @Test
    public void testNewLine(){
    	assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    public void testOtherDelimiter(){
    	assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    @Test
    public void testNegativeNumber(){
    	try {
    		stringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			stringCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }

}
