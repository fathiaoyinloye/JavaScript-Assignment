public class PrimeNumber{
	public static void main(String[] args){

	for(int number = 1; number < 100; number++){	
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) 
			sum = sum + count;
				
			
 		}

		int prime = number + 1;		
		if(prime == sum)
			System.out.println(number + " is a prime number");
				
	}


	}


}
