let number = 10;
let numberOfDivisors = 0;

for(let count = 1; count <= number; count++){
	if(number % count == 0){
		numberOfDivisors +=1;
	}
	
}
console.log(numberOfDivisors)