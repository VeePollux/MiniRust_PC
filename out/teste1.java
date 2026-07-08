import java.util.Scanner;
public class teste1{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float x;
		float y;
		boolean flag;
		float result;
		x = scanner.nextFloat();
		y = scanner.nextFloat();
		flag = (x < y);
		if(flag){
			System.out.println(x);
		}
		result = soma(x, y);
		System.out.println(result);
		while((result > 0.0f)){
			result = (result - 1.0f);
			System.out.println(result);
		}
		imprime(result, flag);
		scanner.close();
	}
	public static float soma(float a, float b){
		float temp;
		temp = (a + b);
		return temp;
	}
	public static void imprime(float v, boolean f){
		System.out.println(v);
		if(f){
			System.out.println(v);
		}
	}
}