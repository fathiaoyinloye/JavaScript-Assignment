import java.util.Scanner;
import java.util.ArrayList;
public class GroceryManagerApp{

	public static void main (String... args){
	ArrayList <String> totalGrocerecies = new ArrayList <String>();


		Scanner scanner = new Scanner(System.in);
		GroceryManager access = new GroceryManager();

		String choice = "0";
		while(!choice.equals("4")){

			System.out.println(showMenu());
			System.out.print("Choose your choice from the menu: ");
			choice = scanner.nextLine();

			switch(choice){
				case "1" -> {
					System.out.print("Enter item you want to add to your grocery list: ");
					String grocery = scanner.nextLine().toLowerCase();
					String result = access.addItems(grocery);
					System.out.println(result);


				}
				case "2" -> {
					System.out.print("Enter item you want to remove from your grocery list: ");
					String grocery = scanner.nextLine().toLowerCase();
					String result = access.removeItems(grocery);
					System.out.println(result);
				}
				case "3" -> { 
						access.showItems();


					}
				case "4" -> {System.out.println("Thanks For Choosing Omotemmy Grocery Manager");}
				default -> {System.out.println("Invalid Input, please  choose from the menus");}

			}

		}

	}



	public static String showMenu(){

	String menu = """
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
	""";
	return menu;

	}



}