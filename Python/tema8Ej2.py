import pickle

class Vehiculo():
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def __str__(self):
        return "Color %s, %s ruedas, %s puertas" %( self.color, self.ruedas, self.puertas )

car = Vehiculo("Rojo", 4, 4)
f = open("Vehiculo", 'w+b')
# source, destination
pickle.dump(car, f)

f.seek(0)
car2 = pickle.load(f)
print(car2)
f.close()