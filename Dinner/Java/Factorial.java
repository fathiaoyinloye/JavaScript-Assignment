import java.util.Scanner;

public class Factorial{
	public static void main(String... args){
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	int factorial = 1;
	
	for(int count = number; count > 1; count--){
		factorial *= count;
	}

	System.out.print(factorial);
	}
}