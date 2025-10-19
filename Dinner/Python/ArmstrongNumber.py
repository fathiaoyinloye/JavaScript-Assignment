number = "153"
numberToCheck = int(number)
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
print(sum)
if numberToCheck == sum:
	armstrong = True;
print(armstrong)