# inicializamos la clase
class Vehiculo():
    # inicializamos los atributos
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def __str__(self):
        return "Color %s, %s ruedas, %s puertas" %( self.color, self.ruedas, self.puertas )

class Coche(Vehiculo):

    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def __str__(self):
        return "color {}, {} km/h, {} ruedas, {} puertas, {} cc".format( self.color, self.velocidad, self.ruedas, self.puertas, self.cilindrada )

# bloque principal
# creamos el nuevo objeto, lo inicializamos y se imprime
coche = Coche("azul", 4, 4, 150, 1200)
c2 = Vehiculo("negro", 2, 0)
print(coche)
print(c2)