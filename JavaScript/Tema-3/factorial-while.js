const numero = 10;
let factorial = 1;

let i = 2;
while (i <= numero) {
	factorial *= i;
	i++;
}

console.log(`El factorial de ${numero} es ${factorial}.`);