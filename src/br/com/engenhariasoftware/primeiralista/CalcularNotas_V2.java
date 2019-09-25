package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class CalcularNotas_V2 {

	public static void main(String[] args) {
		double total = 0;
		int qtdNotas = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas: ");

		qtdNotas = n.nextInt();
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			double nota = n.nextDouble();
			total = total + nota;
		}

		double media = total / qtdNotas;
		System.out.println("A media é: " + media);

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media > 4) {
			System.out.println("Final!");
		} else {
			System.out.println("Reprovado!");
		}
		
	}

}
