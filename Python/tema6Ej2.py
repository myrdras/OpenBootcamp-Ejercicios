class Alumno():
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def __str__(self):
        return "Alumno %s, nota %s" %( self.nombre, self.nota )


p1 = Alumno("Alan", 7)
print(p1)