numbers = input("Enter any number: ")
largest =  0
for characters in numbers:
	if int(characters) > largest:
		largest = int(characters)
print(largest)