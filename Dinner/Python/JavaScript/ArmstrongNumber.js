let number = 1634;
let numberToCheckNumberOfDigit = number;
let numberCheck = number;
let numberOfDigit = 0;
let armStrong = false;
let total = 0;
for (let count = 0; numberToCheckNumberOfDigit > 0; count++){
	let digit = numberToCheckNumberOfDigit % 10;
	numberOfDigit += 1;

	numberToCheckNumberOfDigit = Math.floor(numberToCheckNumberOfDigit / 10);
}

for (let count = 0; numberCheck > 0; count++){
	let digit = numberCheck % 10;
	let product = 1;

	for(let counter = 0; counter < numberOfDigit; counter++){
		product *= digit;

	}
	
	total += product;
	numberCheck = Math.floor(numberCheck/10);	

}
if (number == total)
	armStrong = true;



