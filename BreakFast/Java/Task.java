

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


	}				


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



String name = "Fathia";
int count = 0;
for (int index = 0; index < name.length(); index++){
if (name.charAt(index) == Character.toLowerCase(name.charAt(index)))
	count = count+1	;
System.out.println(count);

}			

String characters = "Taitope";
int count = 1;
int position = 0;
for(int index = 0; index < characters.length(); index++){
	if(characters.charAt(index) == 'a' || characters.charAt(index) == 'e' || characters.charAt(index) == 'i' || characters.charAt(index) == 'u' || characters.charAt(index) == '0'){
		break;

	}
				position = index + 1;

				System.out.println("The first vowel position is index "+ position); 

}
*/

String characters = "dele";
for (int count = 0; count < characters.length(); count++){ 
	System.out.println("The ASCII value of " + characters.charAt(count) + " is " + (int) characters.charAt(count));

}	


}




}