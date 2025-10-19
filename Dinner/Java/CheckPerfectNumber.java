import java.util.Scanner;

public class CheckPerfectNumber{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0) {
			sum = sum + count;
				
			}
 		}

		int perfect = sum - number ;		
		if(perfect == number){
			System.out.println(number + " is a perfect number");
		}
		else{
			System.out.println(number + " is not a perfect number");
		}


	}


}
