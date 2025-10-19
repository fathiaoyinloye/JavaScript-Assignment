number_to_find_factorial = int(input("Enter a number: "))
factorial = 1;
	
for number in range (number_to_find_factorial , 1, -1):
	factorial *= number;

print(factorial);

