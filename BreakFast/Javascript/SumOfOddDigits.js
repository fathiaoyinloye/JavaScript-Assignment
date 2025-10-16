let number = 45326;
let sum = 0;
for (let count = 0; number > 0; count++){
	let digit = number % 10;
	if(digit % 2 != 0)
		sum+= digit;

	number = Math.floor(number/10);
}
		console.log(sum)
