function findLSmallestDigit (number){
let count = 0
let smallest = 10
	while(number > 0){
		let digit = number % 10
		if(digit < smallest)
			smallest = digit
		number = Math.floor(number/10)
		count += 1
	}
	return smallest

}
console.log(findLSmallestDigit(89735678))