count = 0
for  year in range (1900,2026):
	if (year % 4 == 0 and year % 100 != 0):
		count += 1

	elif (year % 4 == 0 and year % 100 == 0 and year % 400 == 0):
		count += 1
print(count)
	

