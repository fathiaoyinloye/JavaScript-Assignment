function reverseWord(word){
	let newWord = "";
	for(let count = 0; count < word.length; count++){
		newWord = word.charAt(count) + newWord;
			
	}
		let result = newWord.split(" ");

		return result;
}

function getChangedOutput(result){
	let myWord = "";
	for (let counter = result.length - 1; counter >= 0; counter--){ 
		myWord = myWord + result[counter] + " ";
	}
	return myWord;

}


let words = "This is an example. welcome to my world";
let myWords = reverseWord(words);
console.log(getChangedOutput(myWords));

