let characters = "aToNe";
let countLowercase = 0;
for(let index = 0; index < characters.length; index++){
	if(characters.charAt(index) == characters.charAt(index).toLowerCase())
		countLowercase += 1;	

}
	console.log(countLowercase);
