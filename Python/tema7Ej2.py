import time
hora = int(time.strftime("%H"))
minut = int(time.strftime("%M"))
if hora >= 19:
	print("Es hora de ir a casa")
else:
	print(f"Faltan {18-hora}horas y {59-minut}min para volver a casa")