peso = input('Ingrese su peso en kg ')
altura = input('Ingrese su peso en metros ')
imc = round(float(peso) / (float(altura) ** 2))
print ('Tu índice de masa corporal es ' + str(imc))