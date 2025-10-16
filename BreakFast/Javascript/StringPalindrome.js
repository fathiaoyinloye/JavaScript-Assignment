let characters = "Madam";
let reverse = "";
for(let index = 0;  index < characters.length; index++){
	reverse = characters.charAt(index) + reverse

}
if (characters.toLowerCase() == reverse.toLowerCase() )
	console.log(characters + " is a Palindrome.")
else
	console.log(characters + " is not a Palindrome.")

