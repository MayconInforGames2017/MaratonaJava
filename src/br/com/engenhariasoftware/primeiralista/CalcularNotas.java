package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class CalcularNotas {

	// public static double notasDigitadas() {

	// }

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double media = 0;
		double n1;
		double n2;
		double n3;
		double n4;

		System.out.println("Digite a primeira nota: ");
		n1 = n.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n2 = n.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n3 = n.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n4 = n.nextDouble();

		media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 7) {
			System.out.println("Sua media �: " + media + " Voc� est� aprovado: ");
		} else if (media > 4) {
			System.out.println("Sua media �: " + media + " Voc� est� em recupera��o: ");
		} else {
			System.out.println("Sua media �: " + media + " Voc� est� reprovado: ");
		}

		System.out.println("A m�dia �: " + media);

	}

}
