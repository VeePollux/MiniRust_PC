fn main() {
	let x: f32;
	let y: f32;
	let flag: bool;
	let result: f32;

	x = read_float();
	y = read_float();

	flag = (x < y);

	if flag {
		println! x;
	};

	result = soma(x, y);
	println! result;

	while (result > 0) {
		result = (result - 1);
		println! result;
	};

	imprime(result, flag);

}

fn soma(a: f32, b: f32) -> f32 {
	let temp: f32;
	temp = (a + b);
	return temp;
}

fn imprime(v: f32, f: bool) -> void {
	println! v;
	if f {
		println! v;
	};
}