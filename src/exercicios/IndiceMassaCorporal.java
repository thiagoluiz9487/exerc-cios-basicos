package exercicios;

import java.util.Scanner;

public class IndiceMassaCorporal {
	
	public static void main(String[] args) {
		
	System.out.println("Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.");
	
	String nome;
	String peso;
	String altura;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Qual seu nome?: ");
	nome = entrada.nextLine();
	System.out.print("Qual seu peso?: ");
	peso = entrada.nextLine().replace(",",".");
	System.out.print("Qual sua altura?: ");
	altura  = entrada.nextLine().replace(",",".");
	
	 double peso2 = Double.parseDouble(peso);
	 double altura2 = Double.parseDouble(altura);
	 
	 System.out.printf("olá %s, seu peso é %.1fk, e sua altura %.2fm",nome, peso2, altura2);
	 System.out.println();
	 
	 altura2 = Math.pow(altura2, 2);
	 
	 double resultado = peso2 / altura2;
	 
	 System.out.printf("Seu IMC é: %.2f", resultado);
	
	
	entrada.close();
		
	}
}
