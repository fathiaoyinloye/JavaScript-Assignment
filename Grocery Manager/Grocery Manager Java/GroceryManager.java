import java.util.ArrayList;

public class GroceryManager{

	ArrayList <String> totalGrocerecies = new ArrayList <String>();


	
	public  int totalGrocerecies(){
		return totalGrocerecies.size();


	}
	public  String addItems(String grocery){
		for (String item : totalGrocerecies){
			if (item.equalsIgnoreCase (grocery))
				return "An Item cannot be entered twice";
		}
		totalGrocerecies.add(grocery);
		String result = grocery + " have been successfully added";
		return result;


	}

	public  String removeItems(String grocery){
		for (String item : totalGrocerecies){
			if (!item.equalsIgnoreCase (grocery))
				return "An Item that is not on the grocery list cannot be removed";
		}
		totalGrocerecies.remove(grocery);
		String result = grocery + " have been successfully removed from the grocery list";
		return result;


	}

	public  void showItems(){
			if (totalGrocerecies() == 0){
				System.out.println("There is no item in the GroceryList");}
			else{
		
				for (int items = 0; items < totalGrocerecies.size(); items++ ){
					System.out.println(totalGrocerecies.get(items));
				}
		}

	}




}