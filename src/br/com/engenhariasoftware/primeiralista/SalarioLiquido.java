package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double salarioBruto, INSS, IRRF;
		double salarioLiquido = 0;

		System.out.println("Digite o salário bruto R$: ");
		salarioBruto = s.nextDouble();

		INSS = salarioBruto / 100 * 11;

		IRRF = salarioBruto / 100 * 7.5;

		salarioLiquido = salarioBruto - INSS - IRRF;

		System.out.println("O salário liquido total é de R$: " + salarioLiquido);
	}

}
