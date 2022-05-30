package exerciciosFundamentos;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
	String weight = JOptionPane.showInputDialog("Qual o peso?").replace(",", ".");
	String height = JOptionPane.showInputDialog("Qual a altura?").replace(",", ".");
	
	
	double peso = Double.parseDouble(weight);
	double al = Double.parseDouble(height);
	
	double altura = Math.pow(al, 2);
	
	double IMC = (peso / altura);
	
	JOptionPane.showMessageDialog(null, "Seu IMC é: \n" + IMC);
	
	
	System.out.println("O IMC é: " + IMC);
	

	}

}
