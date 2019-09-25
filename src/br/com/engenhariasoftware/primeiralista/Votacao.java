package br.com.engenhariasoftware.primeiralista;

import java.util.Random;

public class Votacao {

	public static void main(String[] args) throws InterruptedException {
		try {
			int tempo = 60;
			int chapa1 = 0, chapa2 = 0, brancos = 0, nulos = 0;
			Random random = new Random();
			for (int i = 0; i < tempo; i++) {
				Thread.sleep(1000);
				System.out.println("Os votos estão sendo computados");
				int voto = random.nextInt(4);
				switch (voto) {
				case 0:
					brancos++;
					break;
				case 1:
					chapa1++;
					break;
				case 2:
					chapa2++;
					break;
				default:
					nulos++;
					break;
				}
				if (chapa1 > chapa2) {
					System.out.println("Chapa 1 venceu! ");
				} else {
					if (chapa2 > chapa1) {
						System.out.println("Chapa 2 venceu! ");
					} else {
						System.out.println("Ouve empate técnico: ");
					}

				}

			}
			
			System.out.println("Votos brancos: " + brancos + "\n Votos chapa 1: " + chapa1 + "\n Votos chapa 2: "
					+ chapa2 + "\n Votos nulos: " + nulos);

		} finally {

		}
	}
}
