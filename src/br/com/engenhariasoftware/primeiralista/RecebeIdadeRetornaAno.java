package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class RecebeIdadeRetornaAno {

	public static void main(String[] args) {
		while (true) {
			try {
				int recebeIdade = idadeDigitada();
				break;
			} catch (Exception e) {
				System.out.println("Digite uma idade válida: ");
			}
		}
	}

	public static int idadeDigitada() {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int recebeIdade = n.nextInt();
		n.close();
		int ano = recebeIdade * 365;
		System.out.println("A sua idade em dias é: " + ano);
		return recebeIdade;
	}

}
