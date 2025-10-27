const prompt = require('prompt-sync')();

let choice = "0";
while(choice != "4")){
	console.log((showMenu());
	choice = prompt("Choose your choice from the menu: ");

	switch(choice){
		case "1": {
			let grocery = prompt("Enter item you want to add to your grocery list: ");
			let result = access.addItems(grocery);
			console.log(result);
			break


			}
		case "2": {
			let grocery = prompt("Enter item you want to remove from your grocery list: ");
			let result = access.removeItems(grocery);
			console.log(result);
			break
			}
		case "3" -> { 
			access.showItems();
			break
			}
			case "4" : {consoe.log("Thanks For Choosing Omotemmy Grocery Manager");break}
			default: {console.log("Invalid Input, please  choose from the menus");}

	}



}



