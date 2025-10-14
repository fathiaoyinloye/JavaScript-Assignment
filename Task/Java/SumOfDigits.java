import java.util.Scanner;

public class  SumOfDigits{
	public static void main (String... args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numbers = scanner.nextInt();
	int sum = 0;		
		while(numbers > 0){
		int digit = numbers % 10;
			sum += digit;
			numbers = numbers/10;



	}			

					
	System.out.print(sum);	
	

	}


}