const numero = 10;
let factorial = 1;

for (let i = 2; i <= numero; i++) {
	factorial *= i;
}

console.log("El factorial de " + numero + " es " + factorial + ".");