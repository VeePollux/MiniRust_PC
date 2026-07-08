import java.util.Scanner;
public class teste2{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float a;
		float b;
		float n;
		float max;
		float fat;
		boolean flag;
		float i;
		float j;
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		n = scanner.nextFloat();
		max = maior(a, b);
		System.out.println(max);
		fat = fatorial(n);
		System.out.println(fat);
		flag = positivo(n);
		imprimeResultado(fat, flag);
		i = 0.0f;
		while((i < 3.0f)){
			j = 0.0f;
			while((j < 2.0f)){
			if(((positivo(i) && positivo(j)) || (i == j))){
			System.out.println(i);
			System.out.println(j);
		}
			j = (j + 1.0f);
		}
			i = (i + 1.0f);
		}
		if((maior(a, b) > 0.0f)){
			if(positivo(n)){
			System.out.println(n);
		}
		}
		scanner.close();
	}
	public static float maior(float x, float y){
		float resultado;
		resultado = 0.0f;
		if((x > y)){
			resultado = x;
		}
		if((y > x)){
			resultado = y;
		}
		if((x == y)){
			resultado = x;
		}
		return resultado;
	}
	public static float fatorial(float num){
		float resultado;
		float contador;
		resultado = 1.0f;
		contador = num;
		while((contador > 0.0f)){
			resultado = (resultado * contador);
			contador = (contador - 1.0f);
		}
		return resultado;
	}
	public static boolean positivo(float valor){
		return (valor > 0.0f);
	}
	public static void imprimeResultado(float valor, boolean flag){
		System.out.println(valor);
		if(flag){
			System.out.println(valor);
		}
	}
}