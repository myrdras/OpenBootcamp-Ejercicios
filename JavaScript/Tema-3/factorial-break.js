const numero = 10;
let factorial = numero;

let i = numero;
while (true) {
	if (i > 0) {
		factorial *= i;
		i--;
	} else {
		break;
	}
}

console.log("El factorial de %d es %d.", numero , factorial);