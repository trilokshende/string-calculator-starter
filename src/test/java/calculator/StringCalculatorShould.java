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
    	assertEquals(15, stringCalculator.add("1,2,3,4,5"));
    }
}
