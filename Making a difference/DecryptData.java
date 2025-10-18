import java.util.Scanner;
public class DecryptData{
	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a four digit number: ");
		int number = scanner.nextInt();

		while (number < 1000 || number >= 10000){
			System.out.println("Invalid Input!");
			System.out.print("Please, Enter a four digit number: ");
			number = scanner.nextInt();
		}

		String numberString = String.valueOf(number);
		char[] numbers = new char[4];

		for (int count = 0; count < numberString.length(); count++){
			numbers[count] = numberString.charAt(count);
		}


		String numberArranged = "" + numbers[2] + numbers[3]+ numbers[0] + numbers[1];
		System.out.println(numberArranged);

		int originalNumber = Integer.parseInt(numberArranged);
		int decryptNumber = 0;
		int multiplier = 10;

		for (int count = 0; originalNumber > 0; count++){
			int digit = originalNumber % 10;
			int newNumber = (digit - 7 + 10)  % 10;
			decryptNumber = decryptNumber *  multiplier + newNumber;
			if(count == 0)
			decryptNumber = newNumber;
			originalNumber = originalNumber/10;		
		}

		System.out.print(decryptNumber);

		
	}


}