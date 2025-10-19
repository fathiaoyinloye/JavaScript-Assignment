word = "plindrome"
count = 0
word_position = 0
for letter in word:
	if word[count] == "a" or word[count] == "e" or word[count] == "i" or word[count] == "o" or word[count] == "u":
		word_position = count
		break
	count += 1
print(word_position)
