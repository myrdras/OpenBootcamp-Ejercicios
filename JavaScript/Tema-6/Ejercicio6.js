let compra = ["Queso", "Arroz", "Fideos", "Leche", "Detergente"]
compra.push("Aceite de Girasol") // Agrego elemento
compra.pop() // Elimino el ultimo elemento

let movies = [
   {
      titulo: "Minions",
      director: "Pierre Coffin",
      fecha: "2015"
   },
   {
      titulo: "Madagascar",
      director: "Eric Darnell",
      fecha: "2005"
   },
   {
      titulo: "Divergente",
      director: "Neil Burger",
      fecha: "2014"
   }
] // 3 peliculas favoritas
const moviesNews = movies.filter(peli => peli.fecha >= 2010) // peliculas posteriores a 2010
const directores = movies.map(peli => peli.director) // directores de las peliculas
const titulos = movies.map(peli => peli.titulo)
const directoresYTitulos = directores.concat(titulos)
const directoresYTitulos2 = [...directores, ...titulos]