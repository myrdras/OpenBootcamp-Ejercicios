def bisiesto(n: int):
	if n % 4 == 0 and ( n % 100 != 0 or n % 400 == 0):
		return 'Es bisiesto'
	else:
		return 'No es bisiesto'


print (bisiesto(2004))