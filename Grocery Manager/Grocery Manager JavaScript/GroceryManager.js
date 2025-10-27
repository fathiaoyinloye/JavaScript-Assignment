const prompt = require('prompt-sync')();


const totalGrocerecies = []

function addItems(grocery){
	for (const item of totalGrocerecies){
		if (item == grocery)
			return "An Item cannot be entered twice";
	}
	totalGrocerecies.push(grocery);
	let result = grocery + " have been successfully added";
	return result;


}


function removeItems(grocery){
	for (const item of totalGrocerecies){
		if (item != grocery)
			return "An Item that is not on the grocery list cannot be removed";
	}
	totalGrocerecies.pop(grocery);
	let result = grocery + " have been successfully removed from the grocery list";
	return result;


	}

function showItems(){
	if (totalGrocerecies.length == 0)
		return 0;
	
	return totalGrocerecies
}



function showMenu(){

	let menu = `
*****************************************
*	OMOTEMMY GROCERY MANAGER	*
*****************************************
*>>>>>>>>>>>>>>Choose Menu<<<<<<<<<<<<<<*
*****************************************
*	1->	Add Item		*
*	2->	Remove Item		*
*	3->  Show all available Items	*	
*	4->	Exist			*
*****************************************
	`;
	return menu;

}
console.log(showMenu())



let choice = "0"
while(choice != "4"){
	choice = prompt("Choose your choice from the menu: ");

	switch(choice){
		case "1": {
			let grocery = prompt("Enter item you want to add to your grocery list: ");
			let result = addItems(grocery);
			console.log(result);
			break


			}
		case "2": {
			let grocery = prompt("Enter item you want to remove from your grocery list: ");
			let result = removeItems(grocery);
			console.log(result);
			break
			}
		case "3" : { 
			let result = showItems();
			if (result ==  0)
				console.log("There is nothing on the Grocery list");
			else {
				for (let item of totalGrocerecies)
					console.log(item)
				}
			break
			}
			case "4" : {console.log("Thanks For Choosing Omotemmy Grocery Manager");break}
			default: {console.log("Invalid Input, please  choose from the menu");}

	}
}
