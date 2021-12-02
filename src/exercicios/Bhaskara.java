package exercicios;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		
		System.out.println("Criar um programa que resolve equa��es do segundo grau \n"
				+ "(ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. \n"
				+ "Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta");
		
		// DESCOBRINDO DELTA
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira os valores de a, b, e c, com suas respectivas pot�ncias");
		
		System.out.print("digite o valor de a: ");
		int a = entrada.nextInt();
		System.out.print("digite o valor de b: ");
		int b = entrada.nextInt();
		System.out.print("digite o valor de c: ");
		int c = entrada.nextInt();
		
		System.out.println();
		
		System.out.printf("formula do Delta: %d� - 4.%d.%d", a, b, c);
		double delta = (Math.pow(b, 2)) - 4*a*c;
		System.out.println();
		System.out.println(" O Delta da equa��o �: " + delta);
		
		entrada.close();
		// DESCOBRINDO RAIZ DE DELTA
		
		
		int sub = 1;
		int contador = 0;
		for(double delta2 = delta;delta2 >= 0;delta2 -= sub) {
			sub += 2;
			contador ++;
			
			
		}
		System.out.printf("valor de Delta � %.0f e a Raiz � %d", delta, contador);
	}
}
