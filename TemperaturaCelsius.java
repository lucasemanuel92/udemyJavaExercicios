package exerciciosFundamentos;

import java.util.Scanner;

public class TemperaturaCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celsius? ");
		double temp = entrada.nextDouble();
		
		//Conversão
		double conversao = (temp * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit é? " + conversao);
		
		entrada.close();
	}

}


// Escrever um programa que transforme Celisus para Fahrenheit