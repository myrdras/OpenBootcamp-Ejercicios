import tkinter
from tkinter import ttk

def salir():
	print('Chau')
	ventana.quit()

def reset():
	seleccion.set('None')

# En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha 
# seleccionado y que contenga un botón de reinicio para que deje todo como al principio.
#Al principio no tiene que haber una opción seleccionada.

# eti_saludo = tkinter.Label(ventana, text="Hola", bg="blue", fg="white")
# eti_saludo.pack(ipadx=50, ipady=50, fill='x', expand=True)

ventana = tkinter.Tk()

seleccion = tkinter.StringVar()
r1 = ttk.Radiobutton(ventana, text='Window', value='1', variable=seleccion)
r2 = ttk.Radiobutton(ventana, text='MacOS', value='2', variable=seleccion)
r3 = ttk.Radiobutton(ventana, text='Linux', value='3', variable=seleccion)
r4 = ttk.Radiobutton(ventana, text='MS DOS', value='4', variable=seleccion)
r5 = ttk.Radiobutton(ventana, text='AmigOS', value='5', variable=seleccion)
r6 = ttk.Radiobutton(ventana, text='BeOS', value='6', variable=seleccion)
r7 = ttk.Radiobutton(ventana, text='OS/2', value='7', variable=seleccion)

r1.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)
r2.grid(column=0, row=2, sticky=tkinter.W, padx=5, pady=5)
r3.grid(column=0, row=3, sticky=tkinter.W, padx=5, pady=5)
r4.grid(column=0, row=4, sticky=tkinter.W, padx=5, pady=5)
r5.grid(column=0, row=5, sticky=tkinter.W, padx=5, pady=5)
r6.grid(column=0, row=6, sticky=tkinter.W, padx=5, pady=5)
r7.grid(column=0, row=7, sticky=tkinter.W, padx=5, pady=5)

botonReset = ttk.Button(ventana, text='Reset', command=reset)
botonReset.grid(column=0, row=8, sticky=tkinter.E, padx=5, pady=5)
botonSalir = ttk.Button(ventana, text='Salir', command=salir)
botonSalir.grid(column=1, row=8, sticky=tkinter.E, padx=5, pady=5)

ventana.mainloop()

# import pprint
# print(type(ventana))
# pprint.pprint(dir(ventana))