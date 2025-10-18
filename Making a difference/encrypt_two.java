
public class EncryptData{

	public static void main(String... args){
		int[] encrypt = new int[4];
		int number = 5306;
		int checkNumber = number;
		int joinNumbers = 0;
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