let number = 12321
let digit = 0
let reverseNumber = 0;
let multiplier = 10;
let numberToCheck = number;
for (let count = 1; number > 0; count ++){
	digit = number % 10;
	number = Math.floor(number/10);
	reverseNumber = reverseNumber * multiplier + digit;
	if (count == 1)
		reverseNumber = digit * 1;


}	

	if (numberToCheck == reverseNumber)
	console.log(numberToCheck + " is a Palindrome")			
		else
	console.log(numberToCheck + " is not a Palindrome")			
	

