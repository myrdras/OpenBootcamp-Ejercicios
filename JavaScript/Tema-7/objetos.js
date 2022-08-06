// Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
const datos = {
   nombre: "Macarena",
   apellido: "Espindola",
   edad: 28,
   altura: 1.62,
   eresDesarrollador: true
}

// Una variable que obtenga tu edad a partir del objeto anterior
const miEdad = datos.edad

// Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
const amigo1 = {
   nombre: "Belen",
   apellido: "Farias",
   edad: 31,
   altura: 1.65,
   eresDesarrollador: false
}
const amigo2 = {
   nombre: "Florencia",
   apellido: "Pereira",
   edad: 26,
   altura: 1.60,
   eresDesarrollador: true
}

const lista = [{...datos}, {...amigo1},{...amigo2}]

// Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
const orLista = lista.sort((a, b) => a.edad - b.edad)