package exerciciosFundamentos;

import java.util.Scanner;

public class Conversao1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Fahrenheit?");
		double temp = entrada.nextDouble();
		
		//Conversão 
		double conversao = (temp - 32) / 1.8;
		
		System.out.println("A temperatura em Celsius é: " + conversao);
		
		entrada.close();
		
		
		
	}
	
	
}
