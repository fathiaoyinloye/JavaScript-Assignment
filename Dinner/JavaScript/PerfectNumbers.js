for (let number = 1; number <= 1000; number++){	
	let sum = 0;
	for(let count = 1; count <= number; count++){
		if(number % count == 0) 
		sum = sum + count;

 	}

	let perfect = sum - number ;		
	if(perfect == number)
	console.log(number + " is a perfect number");
					
}

	



