public class Breakfast{

	public static int averageOfNumbersBetweenOneToTen(){
		int sum = 0;
		int average = 0;

		for (int count = 1; count <=100; count++){
			sum = sum + count;
			average = sum/count	
		}
		return average;

	}


	public static int sumOfDivisors(number){
		int sumDivisor = 0;
		for (int count = 1; count <= number; count++){
			if(number % count == 0)
				sumDivisor = sumDivisor + count;	
		}
		return sumDivisor;

	}

	public static int countOfDivisors(number){
		int countDivisor = 0;
		for (int count = 1; count <= number; count++){
			if(number % count == 0)
				countDivisor = countDivisor + 1;	
		}
		return countDivisor;

	}



	public static String reverseLetter(String letters){
		String output = "";
		for (int count = 0; count < letters.length(); count++){
			output =  letters.charAt(count) + output;

		}
		return output;
		
	}

	public static int reverseNumber(int number){
		int digit = 0;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		for (int count = 1; number > 0; count ++){
			digit = number % 10;
			number = number/10;
			reverseNumber = reverseNumber * multiplier + digit;
			if (count == 1)
				reverseNumber = digit * 1;
		}	

		return reverseNumber;
	}


	public static boolean isNumberPalindrome(int number){

		int digit = 0;
		int reverseNumber = 0;
		int multiplier = 10;
		int numberToCheck = number;
		for (int count = 1; number > 0; count ++){
			digit = number % 10;
			number = number/10;
			reverseNumber = reverseNumber * multiplier + digit;
			if (count == 1)
				reverseNumber = digit * 1;

		}	

		if (numberToCheck == reverseNumber)
			return true;
		else
			return false;
	}

	public static int sumOfEvenDigits(int number){
		sum = 0;
		for (int count = 0; number > 0; count++){
			int digit = number % count;
				if(digit % 2 == 0)
					sum+= 1;
			number = number/10;
		}
		return sum;


	}


	public static int sumOfOddDigits(int number){
		sum = 0;
		for (int count = 0; number > 0; count++){
			int digit = number % count;
				if(digit % 2 != 0)
					sum+= 1;
			number = number/10;
		}

		return sum
	}


	public static boolean isLetterPalindrome(String letters){
		String output = "";
		for (int count = 1; count < letters.length(); count++){
			output =  letters.charAt(count) + output;

		}
		if (output.equals(letters))
			return true;
		else
			return false;
	}


	public static int binaryToDecimal(int binaryNumber ){
		int decimal = 0;
		for(int count = 1; binaryNumber > 0; count = count*2){
	
			int digit = binaryNumber %  10;
			decimal = decimal +(digit * count);
			binaryNumber = binaryNumber/10;

		}
		return binaryNumber;
	}

}	

