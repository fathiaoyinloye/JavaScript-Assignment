let sentence = "I2am2a2girl"
let word = ""
let longestWord = ""
let count = 0;

for(let index = 0; index <  sentence.length; index++){
		if(sentence.charAt(index) == "2"){
			longestWord = word;
			count = count + 1;
			word = ""
		
		}
		
	word += sentence.charAt(index);
}
	console.log(count)
