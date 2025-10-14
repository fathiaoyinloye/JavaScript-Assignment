name = input("Enter any words: ")
count = 0
for characters in name:
	if characters == "a": 
		count = count + 1

	if characters == "e" :
		count = count + 1

	if characters == "i" :
		count = count + 1

	if characters == "o" :
		count = count + 1

	if characters == "u" :
		count = count + 1
print(count)