public class SumOfPrimeNumber{
	public static void main(String[] args){
	int occurence = 0;
	for(int number = 1; number < 100; number++){	
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) 
			sum = sum + count;
				
			
 		}

		int prime = number + 1;		
		if(prime == sum)
		occurence = occurence + 1;
				
	}

	System.out.print(occurence);
	}


}
