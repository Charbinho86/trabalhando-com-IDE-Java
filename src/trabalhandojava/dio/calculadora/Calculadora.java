package trabalhandojava.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);
			int divisao = divisao(a,b);
			float divisao1 = divisao1(a,b);
			
			System.out.println("Soma = " + a + " + " + b + " = "  + soma);
			System.out.println("Sub = " +  a  + " - " +  b  + " = " + subtracao);
			System.out.println("Mult = " + a + " * " + b + " = " + multiplicacao);
			if(a < b) {
			System.out.println("Div = " + a + " / " + b + " = " + divisao1);
		}
			else {
				System.out.println("Div = " + a + " / " + b + " = " + divisao);
			}}
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	 
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int divisao(int a, int b) {
	     return a / b;
	}
	
	public static float divisao1(float a, float b) {
		return a / b;
	}
}
