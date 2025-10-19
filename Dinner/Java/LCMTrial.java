
public class LCMTrial{
	public static void main(String[] args){
	
		int number = 10;
		int numberTwo = 15;
		int divisor = 1;
		for(int count = 1; count <= number/2; count++){
			if(number % count == 0){
				divisor *= count ;
				System.out.println(count);
			}			
			
 		}
			System.out.print(divisor);			

		
	}


}
