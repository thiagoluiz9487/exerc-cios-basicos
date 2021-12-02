package exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {

		
		  int op1 = 32; double op2 = (5.0/9);
		  
		  
		  System.out.println("Criar um programa que leia a temperatura " +
		  "\n em Fahrenheit e converta para Celsius.\n\n");
		  
		 System.out.println("Digite a temperatura em Fahrenheit que deseja converter!");
		
		 System.out.print("Temperatura: "); Scanner entrada = new Scanner(System.in);
		 double temperatura = entrada.nextDouble();
		 
		 double resultado = ((temperatura - op1)*op2);
		  

		 System.out.printf("A formula para conversão é: (%.1f - %d) x %.1f",
		 temperatura, op1, op2 ); System.out.println();
		 System.out.printf("o resultado é: %.1f°C ", resultado);
		
		entrada.close();

	}

}
