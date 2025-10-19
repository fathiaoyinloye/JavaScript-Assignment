def reverse_word(word)
	reverse = ""
	for char in word:
		reverse = char + reverse
	return reverse

def reverse_number(number)
	reverse = ""
	for char in number:
		reverse = char + reverse
	return reverse

def position_of_first_vowel(name):
	count = len(name) -1
	first_vowel = ""
	for char in name:
		if(name[count] == "a" or "e" or "i" or "o" or "u"):
			first_vowel = name[count]
		count = count - 1
	return first_vowel

def count_lowercase(name):
	count = len(name) -1
	sum = 0
	for char in name:
		if(name[count] == name[count].lower()):
			sum = sum + 1
		count = count - 1
	return sum


def count_uppercase(name):
	count = len(name) -1
	sum = 0
	for char in name:
		if(name[count] == name[count].upper()):
			sum = sum + 1
		count = count - 1
	return sum


def get_average_of_numbers_between_one_to_hundred():
	sum = 0
	count = 1
	for number in range (1,101):
		sum= sum + number
		count += 1
	average = sum/count
	return average


def divisor(number):
	divisor = []
	for count in range (1, number -1):
	if(number % count == 0):
		divisor.append(count)
	return divisor


def sum_of_divisor(number):
	sum = 0
	for count in range (1, number -1):
	if(number % count == 0):
		sum += 1
	return sum


def isPalindrome(name):
	reverse = ""
	for char in name:
		reverse = char + reverse
	
	if  name == reverse:
		return True
	else:
		return False





