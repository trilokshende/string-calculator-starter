package calculator;

class StringCalculator {

    public int add(String inputString) {
    	if(inputString.isEmpty())
    		return 0;
    	else {
    		String delimiter = ",";
			String[] numbers = splitNumbers(inputString, delimiter+"|\n");
			return sum(numbers);
    	}
    		
    }

	private int sum(String[] numbers) {
		int sum=0;
		for(String number : numbers) {
			sum += toInt(number);
		}
		return sum;
	}

	private String[] splitNumbers(String inputString, String delimiter) {
		return inputString.split(delimiter);
	}

	public int toInt(String inputString) {
		return Integer.parseInt(inputString);//return integer value
	}

}