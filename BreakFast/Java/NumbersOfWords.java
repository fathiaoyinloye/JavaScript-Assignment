public class NumbersOfWords{
	public static void main(String... args){

String sentence = "I am going to school";
int count = 1;

for(int index = 0; index <  sentence.length(); index++){
		if(sentence.charAt(index) == ' ')
			count = count + 1;
		
		}
			System.out.println(count);

	}
}