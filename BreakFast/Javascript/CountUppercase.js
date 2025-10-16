let characters = "aToNe";
let countUppercase = 0;
for(let index = 0; index < characters.length; index++){
	if(characters.charAt(index) == characters.charAt(index).toUpperCase())
		countUppercase += 1;	

}
	console.log(countUppercase);
