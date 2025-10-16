let characters = "Tmitope"
let count = 1;
let position = 0
for(let index = 0; index < characters.length; index++){
	if(characters.charAt(index) === "a" ||characters.charAt(index) === "e" ||characters.charAt(index) === "i" || characters.charAt(index) ==="u" || characters.charAt(index) === "0"){
		position = index + 1;
				console.log("The first vowel position is index "+ position)

		break;

	}


}
