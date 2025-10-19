public class  StrongNumber{
	public static void main(String... args){
		int number = 15;
		int  numberCheck = number;
		int total = 0;
		for(int count = 0; numberCheck > 0; count++){
			int  digit = numberCheck % 10;
				int factorial = 1;
			for(int counter = 1; counter <= digit; counter++){
				factorial *= counter;
			}
				total += factorial;
				numberCheck = numberCheck / 10; 
		}
			if (number == total)
				System.out.println(number + " is a StrongNumber");
			else
				System.out.println(number + " is not StrongNumber");


	}


}