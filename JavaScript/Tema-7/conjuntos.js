// Un nuevo Set con los nombres de tu familia
const nombres = ["Macarena", "Sabrina", "Norma", "Felipe", "Leandro"]
let familia = new Set(nombres)

// Modifica el Set original añadiendo tu nombre (duplicado) (debería darte lo mismo)
familia.add("Macarena")

// Modifica el Set original añadiendo el nombre "Javascript" (ya que empieza a formar parte de tu vida ;)
familia.add("Javascript")