import unittest
from grocery_manager import  *
class TestGroceryManager(unittest.TestCase):
	def test_that_grocery_list_is_empty(self):
		items = []
		actual = show_all_available_items(items)
		expected ="Your Grocery List is Empty"
		self.assertEqual(actual,expected)

	def test_that_grocery_list_is_empty_two(self):
		items = []
		actual = size_of_items(items)
		self.assertEqual(actual,0)


	def test_you_can_add_an_item_to_the_grocery_list(self):
		groceries = []
		grocery = "tomatoes"
		actual = add_items(grocery, groceries)
		expected = "tomatoes successfully added to your grocery list"
		self.assertEqual(actual,expected)

	def test_that_grocery_you_can_add_an_item_to_the_grocery_list_two(self):
		groceries = []
		grocery = "tomatoes"
		add_items(grocery, groceries)
		actual = size_of_items(groceries)
		self.assertEqual(actual,1)


	def test_that_grocery_you_can_add_two_items_to_the_grocery_list(self):
		groceries = []
		grocery = "tomatoes"
		groceries.append(grocery)
		groceries.append("Onions")
		actual = size_of_items(groceries)
		self.assertEqual(actual,2)

	def test_that_grocery_you_can_add_numbers_to_the_list(self):
		self.assertRaises(TypeError,add_items,797)



	def test_you_can_remove_an_item_from_the_grocery_list(self):
		groceries = ["tomatoes","onions"]
		grocery = "tomatoes"
		actual = remove_items(grocery, groceries)
		expected = "tomatoes successfully removed"
		self.assertEqual(actual,expected)

	def test_you_can_only_remove_an_existing_item_from_the_grocery_list(self):
		groceries = ["tomatoes","onions"]
		grocery = "tomatoes paste"
		actual = remove_items(grocery, groceries)
		expected = "tomatoes paste not in the grocery list"
		self.assertEqual(actual,expected)

