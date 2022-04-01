package ImcCalculation;

import java.util.Scanner;

public class ImcCalculation {

	char sexo;
	double peso;
	double altura;

	public double calculoImc(Double altura, Double peso) {
		double alturaQuadrado = altura * altura;
		double imc = peso / alturaQuadrado;
		return imc;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ImcCalculation imc = new ImcCalculation();

		System.out.println("Informe o sexo F feminino e M masculino");
		imc.sexo = sc.next().charAt(0);
		System.out.println("Informe o peso: ");
		imc.peso = sc.nextDouble();
		System.out.println("Informe a altura em metros");
		imc.altura = sc.nextDouble();

		var indiceImc = imc.calculoImc(imc.altura, imc.peso);

		if (imc.sexo == 'M' || imc.sexo == 'm') {
			if (imc.altura < 2.30) {
				if (indiceImc < 20.7) {
					System.out.println("Abaixo do peso! ");
				} else if (indiceImc >= 20.7 && indiceImc < 26.4) {
					System.out.println("No peso normal ");
				} else if (indiceImc >= 26.4 && indiceImc < 27.8) {
					System.out.println("Marginalmente acima do peso");
				} else if (indiceImc >= 27.8 && indiceImc <= 31.1) {
					System.out.println("Acima do peso ideal");
				} else if (indiceImc >= 31.1) {
					System.out.println("Obeso");
				}
			} else {
				System.out.println("Informe uma altura real");
			}
		} else if (imc.sexo == 'F' || imc.sexo == 'f') {
			if (imc.altura < 2.30) {
				if (indiceImc < 19.1) {
					System.out.println("Abaixo do peso! ");
				} else if (indiceImc >= 19.1 && indiceImc < 25.8) {
					System.out.println("No peso normal ");
				} else if (indiceImc >= 25.8 && indiceImc < 27.3) {
					System.out.println("Marginalmente acima do peso");
				} else if (indiceImc >= 27.3 && indiceImc <= 32.3) {
					System.out.println("Acima do peso ideal");
				} else if (indiceImc >= 32.3) {
					System.out.println("Obess");
				}
			} else {
				System.out.println("Informe uma altura real");
			}
		} else {
			System.out.println("Informe o sexo corretamente! F/f Feminino ou M/m masculino");
		}

	}

}
