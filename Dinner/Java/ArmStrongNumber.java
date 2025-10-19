public class ArmStrongNumber{
	public static void main(String... args){
		int number = 1634;
		int numberToCheckNumberOfDigit = number;
		int numberCheck = number;
		int numberOfDigit = 0;
		boolean armStrong = false;
		int total = 0;
		for (int count = 0; numberToCheckNumberOfDigit > 0; count++){
			int digit = numberToCheckNumberOfDigit % 10;
			numberOfDigit += 1;
			numberToCheckNumberOfDigit /= 10;
		}

		for (int count = 0; numberCheck > 0; count++){
			int digit = numberCheck % 10;
			int product = 1;

			for(int counter = 0; counter < numberOfDigit; counter++){
				product *= digit;

			}
	
			total += product;

			numberCheck = numberCheck/10;	

		}
		if (number == total)
			armStrong = true;

		System.out.print(armStrong);




	}
}