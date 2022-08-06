// La fecha de hoy
const fecha = new Date()

// La fecha de tu nacimiento
const nacimiento = new Date(1993, 10, 4)

// Un variable que indique si hoy es más tarde (>) que la fecha de tu nacimiento
let hoyMasTardeNacimiento = fecha > nacimiento

// Una variable que contenga el día de tu nacimiento
let diaNacimiento = nacimiento.getDate()

// Una variable que contenga el mes de tu nacimiento (recuerda que Enero es mes 0)
let mesNacimiento = nacimiento.getMonth() + 1

// Una variable que contenga el año de tu nacimiento (con 4 dígitos)
let yearNacimiento = nacimiento.getFullYear()