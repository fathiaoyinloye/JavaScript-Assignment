import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;


	public class GroceryManagerAppTest{

		GroceryManager groceryManager;

		@BeforeEach
		void setup (){

			groceryManager = new GroceryManager();
		}

	@Test
	public  void testTharGroceryListIsEmpty(){
		int actual = groceryManager.totalGrocerecies();
		assertEquals(actual, 0);
	
	}
	@Test
	public void testThatOneItemCanBenAddedToTheGroceryList(){

	
	String response = groceryManager.addItems("Tomatoes");

	//ASSERT
	assertEquals(response, "Tomatoes have been successfully added");


	}


	@Test
	public void testThatOneItemHaveBeenAddedToTheGroceryListAndTheTotalNumberOfItemsIsOne(){
	
		groceryManager.addItems("Tomatoes");
		int response = groceryManager.totalGrocerecies();
		assertEquals(response, 1);


	}
	@Test
	public void testThatTwoItemsHaveBeenAddedToTheGroceryListAndTheTotalNumberOfItemsIsTwo(){
	
		groceryManager.addItems("Tomatoes");
		groceryManager.addItems("Tooth Paste");
		int response = groceryManager.totalGrocerecies();
		assertEquals(response, 2);


	}
	@Test
	public void testThatOneItemCannotBeAddedToTheGroceryListTwice(){
	
		groceryManager.addItems("tomatoes");
		String response = groceryManager.addItems("tomatoes");
		assertEquals(response, "An Item cannot be entered twice");


	}

	@Test
	public void testThatOneItemWasAddedTwiceAndTheTotalNumberOfItemsIsOne(){
	
		groceryManager.addItems("tomatoes");
		groceryManager.addItems("tomatoes");
		int response = groceryManager.totalGrocerecies();
		assertEquals(response, 1);


	}
	@Test
	public void testThatItemCanBeRemoveFromTheGroceryList(){
	
		groceryManager.addItems("Tomatoes");
		String response = groceryManager.removeItems("Tomatoes");
		assertEquals(response, "Tomatoes have been successfully removed from the grocery list");
	}

	@Test
	public void testThatOneItemWasAddedAndAlsoRemovedAndTheTotalNumberOfItemsIsZero(){
	
		groceryManager.addItems("Tomatoes");
		groceryManager.removeItems("Tomatoes");
		int actual = groceryManager.totalGrocerecies();
		assertEquals(actual, 0);



	}
	@Test
	public void testThatOnlyItemInTheGroceryListCanBeCanBeRemove(){
	
		groceryManager.addItems("Tomatoes");
		String response = groceryManager.removeItems("Fish");
		assertEquals(response, "An Item that is not on the grocery list cannot be removed");


	}

	@Test
	public void testThatOnlyItemInTheGroceryListCanBeCanBeRemoveTwo(){
	
		groceryManager.addItems("Tomatoes");
		groceryManager.removeItems("Tomtoes");
		int actual = groceryManager.totalGrocerecies();
		assertEquals(actual, 1);


	}

	@Test
	public void testThatYouCanViewItemsInTheGroceryList(){
	
		groceryManager.addItems("Tomatoes");
		
		ArrayList <String> result = groceryManager.showItems();
		String actual = result.get(0);
		String expected = "Tomatoes";
		assertEquals(actual, expected);


	}

	
	



}

