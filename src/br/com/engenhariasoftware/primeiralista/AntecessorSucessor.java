package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		while (true) {
			try {
				int digitado = numeroDigitado();
				break;
			} catch (Exception e) {
				System.out.println("Digite um n�mero valido: ");
			}
		}
	}

	public static int numeroDigitado() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int digitado = s.nextInt();
		s.close();
		int antecessor = digitado - 1;
		int sucessor = digitado + 1;
		System.out.println("O antecessor �: " + antecessor + "\n O sucessor �: " + sucessor);
		return digitado;
	}

}
