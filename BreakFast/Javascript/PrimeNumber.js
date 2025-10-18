for(let number = 1; number < 100; number++){	
	let sum = 0;
	for(let count = 1; count <= number; count++){
		if(number % count == 0) 
		sum = sum + count;
					
 		}

		let prime = number + 1;		
		if(prime == sum)
			console.log(number + " is a prime number");
				
	}


