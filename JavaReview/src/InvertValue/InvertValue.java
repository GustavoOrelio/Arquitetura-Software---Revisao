package InvertValue;

import java.nio.file.attribute.AclEntry;
import java.util.Scanner;

import javax.swing.JOptionPane;

import ImcCalculation.ImcCalculation;

public class InvertValue {

	public static void main(String Args[]) {
		
		String numeros;

		numeros = JOptionPane.showInputDialog("Digite os numeros");
		System.out.printf("Numeros nao invertidos: " + numeros);
		
		String numerosInvertidos = new StringBuilder(numeros).reverse().toString();
		System.out.printf("\nNumeros invertidos: " + numerosInvertidos);
	}

}
