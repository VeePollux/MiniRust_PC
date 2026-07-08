fn main() {
	let a: f32;
	let b: f32;
	let n: f32;
	let max: f32;
	let fat: f32;
	let flag: bool;
	let i: f32;
	let j: f32;

	a = read_float();
	b = read_float();
	n = read_float();

	max = maior(a, b);
	println! max;

	fat = fatorial(n);
	println! fat;

	flag = positivo(n);
	imprimeResultado(fat, flag);

	i = 0;
	while (i < 3) {
		j = 0;
		while (j < 2) {
			if ((positivo(i) && positivo(j)) || (i == j)) {
				println! i;
				println! j;
			};
			j = (j + 1);
		};
		i = (i + 1);
	};

	if (maior(a, b) > 0) {
		if positivo(n) {
			println! n;
		};
	};
}

fn maior(x: f32, y: f32) -> f32 {
	let resultado: f32;
    resultado = 0;
	if (x > y) {
		resultado = x;
	};
	if (y > x) {
		resultado = y;
	};
	if (x == y) {
		resultado = x;
	};
	return resultado;
}

fn fatorial(num: f32) -> f32 {
	let resultado: f32;
	let contador: f32;
	resultado = 1;
	contador = num;
	while (contador > 0) {
		resultado = (resultado * contador);
		contador = (contador - 1);
	};
	return resultado;
}

fn positivo(valor: f32) -> bool {
	return (valor > 0);
}

fn imprimeResultado(valor: f32, flag: bool) -> void {
	println! valor;
	if flag {
		println! valor;
	};
}
