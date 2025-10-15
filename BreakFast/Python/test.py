"""name = "Fathia"
reverse = ""
for char in name:
	reverse = char + reverse
	print(reverse)

name = "Toluwalase"
count = len(name) -1
first_vowel = ""
for char in name:
	if(name[count] == "a" or "e" or "i" or "o" or "u"):
		first_vowel = name[count]
	count = count - 1
print(first_vowel)


name = "toluwalase"
count = len(name) -1
sum = 0
for char in name:
	if(name[count] == name[count].upper()):
		sum = sum + 1
	count = count - 1
print(sum)
sum = 0
count = 1
for number in range (1,101):
	sum= sum + number
	count += 1
average = sum/count
print(average)


number = 8
divisor = []
for count in range (1, number -1):
	if(number % count == 0):
		divisor.append(count)
	print(divisor)
name = "madam"
reverse = ""
for char in name:
	reverse = char + reverse
	print(reverse)
if  name == reverse:
	print("true")
else:
	print("false")

"""
digit = 0
number = 152
reverseNumber = 0
multiplier = 10
numberToCheck = number
count = 5
for number in len(number)-1:
	digit = number % 10
	number = number // 10
	reverseNumber = reverseNumber * multiplier + digit
	if (count == 5):
		reverseNumber = digit * 1
	
	count += 1
	print(reverseNumber)	
if (numberToCheck == reverseNumber):
	print("Its a Palindrome")
else:
	print("Its not a Palindrome")


	
	
