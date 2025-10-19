numberString = "165"
number = int(numberString)

count = 0
total = 0
for element in numberString:
	digit = int(numberString[count])
	factorial = 1
	print(digit)

	for element in range (1, digit + 1):	
		factorial *= element
	total += factorial
	count +=1
if (number == total):
	print(f"{number} is a Strong Number")
else:	
	print(f"{number} is not a  Strong Number")
