package exercicios;

import java.util.Scanner;

public class RaizQuadrada {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o valor a ser calculado: ");
		int valor = entrada.nextInt();
		
		
		int sub = 1;
		int contador = 0;
		for(double valor2 = valor; valor2 >= 0;valor2 -= sub) {
			sub += 2;
			contador ++;
		}
		System.out.printf("A Raiz de %d é %d", valor, contador);
		
		entrada.close();
	}

}
