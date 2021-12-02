package exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("digite a temperatura: ");
	double temperatura = entrada.nextDouble();
	
	double op1 = 9.0/5;
	double op2 = 32;
	double resultado = (temperatura * op1) + op2;
	
	System.out.println(" O resultado é: "+ resultado +"°F.");
	

	entrada.close();
	
	
	}
}
