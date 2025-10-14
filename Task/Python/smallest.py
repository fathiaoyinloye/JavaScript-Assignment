numbers = input("Enter any number: ")
smallest =  10
for characters in numbers:
	if int(characters) < smallest:
		smallest = int(characters)
print(smallest)