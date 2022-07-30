const nombre = "Macarena"
const apellido = "Espindola"

const estudiante = nombre.concat(" ", apellido)

const estudianteMayus = estudiante.toUpperCase()
const estudianteMinus = estudiante.toLowerCase()

const estudianteLetrasCant = estudiante.length

const nombrePrimeraLetra = nombre.charAt(0)
const apellidoUltimaLetra = apellido.charAt(apellido.length - 1)

const estudianteSinEspacios = estudiante.replace(/ /g, "")

const nombreEnEstudiante = estudiante.includes(nombre)