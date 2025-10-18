import java.util.Scanner;
public class EncryptData{
	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a four digit number: ");
		int number = scanner.nextInt();

		while (number < 1000 || number >= 10000){
			System.out.println("Invalid Input!");
			System.out.print("Please, Enter a four digit number: ");
			number = scanner.nextInt();
		}

		int[] encrypt = new int[4];
		int multiplier = 1;
		for (int count = 0; number > 0; count++){
			int digit = number % 10;
			int newNumber = (digit + 7)  % 10;
			encrypt[count] = newNumber;
			number = number/10;


		}
		
		String digit1 = String.valueOf(encrypt[0]);
		String digit2 = String.valueOf(encrypt[1]);
		String digit3 = String.valueOf(encrypt[2]);
		String digit4 = String.valueOf(encrypt[3]);
	
		String output = digit2 + digit1 + digit4 + digit3;
		System.out.println(output);






	}
}