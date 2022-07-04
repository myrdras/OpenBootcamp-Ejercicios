import sqlite3

def crearUsuario(ident, nom, ape):
	conn = sqlite3.connect('mibasededatos.db')
	cursor = conn.cursor()

	query = 'INSERT INTO Alumnos(Id, Nombre, Apellido) VALUES (?, ?, ?)'
	cursor.execute(query, (ident, nom, ape))

	conn.commit()
	cursor.close()
	conn.close()

conn = sqlite3.connect('mibasededatos.db', isolation_level=None)
#isolation sirve para no poner commit al final

# En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres 
# columnas: la columna id de tipo entero, la columna nombre que será de tipo texto y la 
# columna apellido que también será de tipo texto.
# Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 
# alumnos a la tabla.
# Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos 
# por consola.

cursor = conn.cursor()

#cursor.execute('CREATE TABLE Alumnos (Id INT, Nombre TEXT, Apellido TEXT)')

crearUsuario(1, 'Alan', 'Lados')
crearUsuario(2, 'Matias', 'Perez')
crearUsuario(3, 'Alejandro', 'White')
crearUsuario(4, 'Mateo', 'Basquez')
crearUsuario(5, 'Pedro', 'Galez')
crearUsuario(6, 'Gabriel', 'Martillo')
crearUsuario(7, 'Facundo', 'Uver')
crearUsuario(8, 'Manuel', 'Vallez')

cursor.execute('SELECT * FROM Alumnos')
print(cursor.fetchall())

cursor.close()
conn.close()