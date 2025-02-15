package calculator;

class StringCalculator {

    public int add(String inputString) {
    	if(inputString.isEmpty())
    		return 0;
    	else {
    		String delimiter = ",";
    		if(inputString.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(inputString.charAt(2));
				inputString = inputString.substring(4);
			}
			String[] numbers = splitNumbers(inputString, delimiter+"|\n");
			return sum(numbers);
    	}
    		
    }

	private int sum(String[] numbers) {
		int sum=0;
		String negativeString = "";
		for(String number : numbers) {
			if(toInt(number)<0) {
				if(negativeString == "")
					negativeString = number;
				else
					negativeString += ","+number;
			}
			if(toInt(number) < 1000)
		    	sum += toInt(number);
		}
		if(!negativeString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
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