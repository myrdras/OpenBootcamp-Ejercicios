import tkinter
from tkinter import ttk

ventana = tkinter.Tk()

etiqueta = tkinter.Label(ventana, text="Selecciona los que quieras", bg="blue", fg="white")
etiqueta.grid(column=0, row=0, sticky='ew')

r1 = ttk.Checkbutton(ventana, text='Window')
r2 = ttk.Checkbutton(ventana, text='MacOS')
r3 = ttk.Checkbutton(ventana, text='Linux')
r4 = ttk.Checkbutton(ventana, text='MS DOS')
r5 = ttk.Checkbutton(ventana, text='AmigOS')
r6 = ttk.Checkbutton(ventana, text='BeOS')
r7 = ttk.Checkbutton(ventana, text='OS/2')

r1.grid(column=0, row=1, sticky=tkinter.W, padx=5, pady=5)
r2.grid(column=0, row=2, sticky=tkinter.W, padx=5, pady=5)
r3.grid(column=0, row=3, sticky=tkinter.W, padx=5, pady=5)
r4.grid(column=0, row=4, sticky=tkinter.W, padx=5, pady=5)
r5.grid(column=0, row=5, sticky=tkinter.W, padx=5, pady=5)
r6.grid(column=0, row=6, sticky=tkinter.W, padx=5, pady=5)
r7.grid(column=0, row=7, sticky=tkinter.W, padx=5, pady=5)
ventana.mainloop()