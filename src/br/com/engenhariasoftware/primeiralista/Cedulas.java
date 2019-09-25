package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int qtd_100 = 0;
		int qtd_50 = 0;
		int qtd_20 = 0;
		int qtd_10 = 0;
		int qtd_5 = 0;
		int qtd_2 = 0;
		int qtd_1 = 0;

		System.out.println("Digite o valor a ser sacado: ");
		double saque = s.nextDouble();

		if (saque >= 100) {
			qtd_100 = (int) (saque / 100);
			saque = saque - (qtd_100 * 100);
		}
		if (saque >= 50) {
			qtd_50 = (int) (saque / 50);
			saque = saque - (qtd_50 * 50);
		}
		if (saque >= 20) {
			qtd_20 = (int) (saque / 20);
			saque = saque - (qtd_20 * 20);
		}
		if (saque >= 10) {
			qtd_10 = (int) (saque / 10);
			saque = saque - (qtd_10 * 10);

		}
		if (saque >= 5) {
			qtd_5 = (int) (saque / 5);
			saque = saque - (qtd_5 * 5);
		}
		if (saque >= 2) {
			qtd_2 = (int) (saque / 2);
			saque = saque - (qtd_2 * 2);
		}
		if (saque >= 1) {
			qtd_1 = (int) (saque / 1);
			saque = saque - (qtd_1 * 1);
		}
		

		System.out.println("Quantidade de cédulas de 100 R$: " + qtd_100);
		System.out.println("Quantidade de cédulas de 50 R$: " + qtd_50);
		System.out.println("Quantidade de cédulas de 20 R$: " + qtd_20);
		System.out.println("Quantidade de cédulas de 10 R$: " + qtd_10);
		System.out.println("Quantidade de cédulas de 5 R$: " + qtd_5);
		System.out.println("Quantidade de cédulas de 2 R$: " + qtd_2);
		System.out.println("Quantidade de cédulas de 1 R$: " + qtd_1);

	}
}