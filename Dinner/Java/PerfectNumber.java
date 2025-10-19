public class PerfectNumber{
	public static void main(String[] args){

		for (int number = 1; number <= 1000; number++){	
			int sum = 0;
			for(int count = 1; count <= number; count++){
				if(number % count == 0) 
				sum = sum + count;

 			}


			int perfect = sum - number ;		
			if(perfect == number)
				System.out.println(number + " is a perfect number");
					
		}

	}


}
