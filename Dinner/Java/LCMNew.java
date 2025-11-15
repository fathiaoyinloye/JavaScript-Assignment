public class LCMNew{

	public static void main (String... args){
	int numberOne = 13;
	int numberTwo = 4;
	int gcd = 0;
	int minimum = numberOne;
	if(numberTwo < minimum)
		minimum = numberTwo;


	for(int count = minimum;  count >= 1; count--)
		if( numberTwo % count == 0 && numberOne % count == 0 ){
			gcd = count;
			break;
		}

		int lcm = (numberOne * numberTwo)/gcd;

		System.out.print(lcm);
	}


}