

import java.util.Scanner;

public class ImcCalculation {

	char gender;
	double weight;
	double height;

	public double calculationImc(Double height, Double weight) {
		double alturaQuadrado = height * height;
		double imc = weight / alturaQuadrado;
		return imc;

	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ImcCalculation imc = new ImcCalculation();

		System.out.println("Informe o sexo F feminino e M masculino");
		imc.gender = read.next().charAt(0);
		System.out.println("Informe o peso: ");
		imc.weight = read.nextDouble();
		System.out.println("Informe a altura em metros");
		imc.height = read.nextDouble();

		var indiceImc = imc.calculationImc(imc.height, imc.weight);

		if (imc.gender == 'M' || imc.gender == 'm') {
			if (imc.height < 2.30) {
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
		} else if (imc.gender == 'F' || imc.gender == 'f') {
			if (imc.height < 2.30) {
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
