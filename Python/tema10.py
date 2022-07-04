import tkinter
from tkinter import ttk

ventana = tkinter.Tk()

# eti_saludo = tkinter.Label(ventana, text="Hola", bg="blue", fg="white")
# eti_saludo.pack(ipadx=50, ipady=50, fill='x', expand=True)

ventana.columnconfigure(0, weigh=1)
ventana.columnconfigure(1, weigh=3)

eti1 = ttk.Label(ventana, text='Username')
eti1.grid(column=0, row=0, sticky=tkinter.W, padx=5, pady=5)
ent1 = ttk.Entry(ventana)
ent1.grid(column=1, row=0, sticky=tkinter.E, padx=5, pady=5)
eti2 = ttk.Label(ventana, text='Password')
eti2.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)
ent2 = ttk.Entry(ventana, show='*')
ent2.grid(column=1, row=1, sticky=tkinter.E, padx=5, pady=5)

boton = ttk.Button(ventana, text='Login')
boton.grid(column=1, row=2, sticky=tkinter.E, padx=5, pady=5)

ventana.mainloop()

# import pprint
# print(type(ventana))
# pprint.pprint(dir(ventana))