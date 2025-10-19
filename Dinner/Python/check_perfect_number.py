number = 6;
sum = 0
count = 1
while(count <= number):
	if(number % count == 0):
		sum += count
	count+= 1
perfect = sum - number
if perfect == number:
	print(f"{number} is a PerfectNumber")
else:
	print(f"{number} is not a PerfectNumber")



