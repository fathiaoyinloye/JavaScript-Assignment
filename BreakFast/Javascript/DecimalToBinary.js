let decimalNumber = 23;
let binary = 0;
let multiplier = 10;
for (let index = 1; decimalNumber > 0; index++){
	let digit = decimalNumber % 2;
	binary = binary * multiplier + digit;
	console.log(binary);
	if (index == 1)
		binary = digit;
	decimalNumber = Math.floor(decimalNumber/ 2);
}
