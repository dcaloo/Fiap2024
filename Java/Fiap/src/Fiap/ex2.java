package Fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//porcentagem
		DecimalFormat fP = new DecimalFormat("#%");

		// repetição
		int voto = 0, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cand5 = 0, cand6 = 0, cont = 0;
			System.out.println("Digite o voto: ");
			voto = entrada.nextInt();
			while (voto != 0) {
				cont++;
			switch (voto) {
			case 1:
				cand1++;
				break;

			case 2:
				cand2++;
				break;

			case 3:
				cand3++;
				break;

			case 4:
				cand4++;
				break;

			case 5:
				cand5++;
				break;

			case 6:
				cand6++;
				break;

			default:
				System.out.println("Voto Invalido!");
				cont--;
			}
			System.out.println("Digite o seu voto");
			voto = entrada.nextInt();
		}
		System.out.println("Candidato 1: " + cand1);
		System.out.println("Candidato 2: " + cand2);
		System.out.println("Candidato 3: " + cand3);
		System.out.println("Candidato 4: " + cand4);
		System.out.println("Votos nulos: " + cand5);
		System.out.println("Votos em Branco: " + cand6);
		System.out.println("Porcentagem dos votos em branco: " + fP.format ((double) cand6 / cont));
		System.out.println("Porcentagem de votos nulos: " + fP.format ((double) cand5 / cont));
		
	}

}
