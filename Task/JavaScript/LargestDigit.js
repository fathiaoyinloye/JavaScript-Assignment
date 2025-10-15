function findLargestDigit (number){
let count = 0
let largest = 0
	while(number > 0){
		let digit = number % 10
		if(digit > largest)
			largest = digit
		number = Math.floor(number/10)
		count += 1
	}
	return largest

}
console.log(findLargestDigit(35678))