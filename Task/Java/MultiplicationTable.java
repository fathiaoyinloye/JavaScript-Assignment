import java.util.Scanner;

public class  MultiplicationTable{
	public static void main (String... args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numbers = scanner.nextInt();
		int product = 1;
		for (int number = 1; number <= 12; number++){
			product = numbers * number;			
			System.out.print(product + " ");						

		}
		

	}


}