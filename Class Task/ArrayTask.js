function debugTrackingApp(myArray){
	for(let number of myArray){
		for (let number of myArray)
		if(number > 5 || number < 1){
			let index = myArray.indexOf(number)
			myArray.splice(index, 1);	
		}
	
	}
	return myArray
}

myArray = [0,3,5,7,9,4,3,7]
console.log(debugTrackingApp(myArray))