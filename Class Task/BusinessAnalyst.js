function businessAnalyst(surveyResults){
	surveyResults.sort((a, b) => b.score - a.score)

	let myArray = []
	for(let element of surveyResults){
		for(let key in element){
			if(`${element[key]}` >= 80)
		myArray.push(`${key} : ${element[key]}`);

		}

	}

	return myArray;
}






let surveyResults =[{fathia: 86}, {Tolu :50}, {Bola: 89}]

let result = [{name: "fathia", score: 91}, {name: "femi", score: 90}, {name: "fathia", score: 99}]
//result.sort((a, b) => b.score - a.score)


//console.log(businessAnalyst(result));

let input = [{longtitude: "null", latitude: 25}, {longtitude: 45, latitude: 52}, {longtitude: null, latitude: 82},  {longtitude: 47, latitude: 52}]
for(let element of input){
for (let element of input){
	for (let value in element)
		if(element[value] == "null"){
			let index = input.indexOf(element)
			input.splice(index, 1)
		}
	}
}
console.log(input)