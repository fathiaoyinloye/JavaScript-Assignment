import java.util.Scanner;

public class  LargestDigit{
	public static void main (String... args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numbers = scanner.nextInt();
	int largest = 0;
	int count = 0;		
		while(numbers > 0){
			int digit = numbers % 10;
			if(count == 0)
				largest = digit;
			numbers = numbers/10;
			if (digit > largest)
				largest = digit;
			count +=1;
			System.out.println(largest);	



	}			

					
	

	}


}