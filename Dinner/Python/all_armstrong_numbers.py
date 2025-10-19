for digit in range(1, 1001):
	numberInt = digit
	number = str(numberInt)
	products = []
	numberOfdigit = len(number)
	new_digit = 0
	armstrong = False;
	for digit in number:
		new_digit = int(digit)
		product = new_digit**numberOfdigit
		products.append(product)
	sum = 0
	for element in products:
			sum+=element
	if numberInt == sum:
		print(numberInt)