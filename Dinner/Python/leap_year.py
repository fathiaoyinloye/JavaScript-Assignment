for  year in range (1900,2026):
	if (year % 4 == 0 and year % 100 != 0):
		print(f"{year} is a Leap Year");

	elif (year % 4 == 0 and year % 100 == 0 and year % 400 == 0):
		print(f"{year} is a Leap Year");

	

