a = input('Ingrese paises separados por \',\'\n')
paises = a.split(', ')
noRep = list(set(paises))
noRep.sort()

print(noRep)