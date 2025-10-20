let number = 6;
let sum = 0;
for(let count = 1; count <= number; count++){
	if(number % count == 0) 
		sum = sum + count;
				
 }
let perfect = sum - number ;		
if(perfect == number)
	console.log(number + " is a perfect number");
else
	console.log(number + " is not a perfect number");
		



