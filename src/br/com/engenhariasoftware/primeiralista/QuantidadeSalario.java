package br.com.engenhariasoftware.primeiralista;

import java.util.Scanner;

public class QuantidadeSalario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salario = 0;
		double salarioMinimo = 0; 
		
		System.out.println("Digite o salário: ");
		salario = s.nextDouble();
		
		salarioMinimo = salario - 954;
		
		System.out.println(salarioMinimo);

	}
	

}
