public class Fibonacci{
	public static void main(String... args){
	int number = 7;
	int checkNumber = number;
	int lcm = 1;
	
		for (int divisor = 2; number >= 1; divisor++){
			if(number % divisor == 0 ) {
			lcm *= divisor;  
			number = number/ divisor;
			}
			
		}

		
					



	}



}