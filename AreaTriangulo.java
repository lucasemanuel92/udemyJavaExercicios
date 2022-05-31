package exerciciosFundamentos;

import javax.swing.JOptionPane;

public class AreaTriangulo {

	public static void main(String[] args) {
		String lado1 = JOptionPane.showInputDialog("Qual o valor da base? ").replace(',', '.');
		String lado2 = JOptionPane.showInputDialog("Qual o valor da altura? ").replace(',', '.');
		
		double base = Double.parseDouble(lado1);
		double altura = Double.parseDouble(lado2);
		
		double area = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);

		
		

	}

}
