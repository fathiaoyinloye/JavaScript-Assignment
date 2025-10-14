import java.util.Scanner;

public class  LargestDigit{
	public static void main (String... args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int numbers = scanner.nextInt();
	int smallest = 0;
	for(int count = 0; numbers > 0; count++){
		int digit = numbers % 10;
		if(count == 0)
			smallest = digit;
		numbers = numbers/10;
		if (digit < smallest)
			smallest = digit;
		count +=1;

	}			
	System.out.println(smallest);	
					
	

	}


}