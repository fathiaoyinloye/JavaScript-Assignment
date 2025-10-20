public class GCD{

	public static void main (String... args){
	int numberOne = 12;
	int numberTwo = 7;
	int gcd = 0;
	int minimum = numberOne;
	if(numberTwo < minimum)
		minimum = numberTwo;


	for(int count = minimum;  count >= 1; count--)
		if( numberTwo % count == 0 && numberOne % count == 0 ){
			gcd = count;
			break;
		}
		System.out.print(gcd);


	}


}