import math

def primo(n: int, divi = 2):
	if divi >= n:
		return 'Es primo'
	elif n % divi != 0:
		return primo(n, divi+1)
	else:
		return 'No es primo'


print (primo(8))