len number = 12321
len digit = 0
len reverseNumber = 0;
len multiplier = 10;
len numberToCheck = number;
for (let count = 1; number > 0; count ++){
	digit = number % 10;
	number = number/10;
	reverseNumber = reverseNumber * multiplier + digit;
	if (count == 1)
		reverseNumber = digit * 1;

	}	

	if (numberToCheck == reverseNumber)
	console.log(number + " is a Palindrome")			
		else
	console.log(number + " is not a Palindrome")			
	}

