let binaryNumber = 10110
let decimal = 0;
		for(let count = 1; binaryNumber > 0; count = count*2){
	
			let digit = binaryNumber %  10;
			decimal = decimal +(digit * count);
			binaryNumber = Math.floor(binaryNumber/10);
			console.log(decimal)


		}




