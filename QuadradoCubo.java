package exerciciosFundamentos;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o numero? ");
		double num1 = entrada.nextDouble();
		
		double quadrado = Math.pow(num1, 2);
		double cubo = Math.pow(num1, 3);
		
		System.out.println("O quadrado é: " + quadrado);
		System.out.println("O cubo é: " + cubo);
		
		entrada.close();
		
	}

}

// Programa que leia um valor e apresente o quadrado e o cubo.