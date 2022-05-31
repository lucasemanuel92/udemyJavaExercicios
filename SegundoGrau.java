package exerciciosFundamentos;

import java.util.Scanner;

public class SegundoGrau {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sendo a equa��o ax� + bx + c = 0");
		
		System.out.println("Digite o valor de a ");
		int a = entrada.nextInt();
		
		
		System.out.println("Digite o valor de b ");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de c ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		//Termo geral
		System.out.printf("Sua equa��o �: %dx� + %dx + (%d) = 0", a, b, c);
		
		System.out.println("\nO valor de delta �: " + delta);
		
		// Ra�zes
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("A ra�z x1 �: %.2f", x1);
		
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nA ra�z x1 �: %.2f", x2);

		
		entrada.close();
		
	}

}


// Criar um programa que entregue os dados de uma equa��o de segundo grau
// Caso a raiz seja negativa x1 e x2 = NaN