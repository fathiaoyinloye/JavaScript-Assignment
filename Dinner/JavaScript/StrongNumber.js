let number = 145;
let  numberCheck = number;
let total = 0;
for(let count = 0; numberCheck > 0; count++){
	let  digit = numberCheck % 10;
	let factorial = 1;
	for(let counter = 1; counter <= digit; counter++){
		factorial *= counter;
	}
		total += factorial;
		numberCheck = Math.floor(numberCheck / 10); 
}
	if (number == total)
		console.log(number + " is a StrongNumber");
	else
		console.log(number + " is not StrongNumber");

