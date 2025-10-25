import unittest
from grocery_manager import  *
class TestGroceryManager(unittest.Testcase):
	def test_that_grocery_list_is_empty(self):
		actual = show_all_available_items(items)
		expected ="Your Grocery List is Empty"
		self.assertEqual(actual,expected)