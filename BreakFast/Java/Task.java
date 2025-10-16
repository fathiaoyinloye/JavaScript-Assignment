

public class Task{

public static void main(String... args){

/*
int binaryNumber = 10111;
int decimal = 0;

	for(int count = 1; binaryNumber > 0; count = count*2){
	
	int digit = binaryNumber %  10;
	decimal = decimal +(digit * count);
	binaryNumber = binaryNumber/10;
	System.out.println(decimal);


	}				*/


	int decimalNumber = 23;
	int binary = 0;
	int multiplier = 10;
	for (int index = 1; decimalNumber > 0; index++){
	int digit = decimalNumber % 2;

		if (index == 1)
			binary = digit;
	binary = binary * multiplier + digit;
	System.out.println(binary);

		
	decimalNumber = decimalNumber/ 2;
}

	



				

}




}