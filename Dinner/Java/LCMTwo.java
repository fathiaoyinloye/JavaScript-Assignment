/* 	prompt user to enter a number
	save as number
	create a  variable call it divisible, two is the lowest possible number that can divide any number, therefore equate divisible to 10
	check if two can divide the number, if not add 1 to the divisible until it can divide the number.
	create another variable sum where all the divisible will be adding up
	print sum
					*/




import java.util.Scanner;

public class LCMTwo{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int first = scanner.nextInt();

		System.out.print("Enter second number: ");
		int second = scanner.nextInt();

		
		int divisible = 2;
		int lcm = 1;
		while(first != 1 && second != 1){

			if(first  % divisible == 0 && second  % divisible == 0 ) {
			lcm = lcm * divisible;  
			first = first/ divisible;
			second = second/ divisible;

			}
			else if (first  % divisible != 0 && second  % divisible != 0 ){
			divisible = divisible + 1;

			}
		
		}
		System.out.println(lcm);

	}
}