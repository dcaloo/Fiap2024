package Fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int canal = 0, numero = 0, totNumero = 0, cont4 = 0, cont5 = 0, cont7 = 0, cont12 = 0, cont=0;

		System.out.println("Digite o numero do canal: ");
		canal = entrada.nextInt();
		System.out.println("Digite o numero de pessoas: ");
		numero = entrada.nextInt();

		while (canal != 0) {
			switch (canal) {
			case 4:
				System.out.println("Digite o número do canal correto: ");
				numero = entrada.nextInt();
				cont4 += numero;
				break;

			case 5:
				System.out.println("Digite o número do canal correto: ");
				numero = entrada.nextInt();
				cont5 += numero;
				break;
			case 7:
				System.out.println("Digite o número do canal correto: ");
				numero = entrada.nextInt();
				cont7 += numero;
				break;
			case 12:
				System.out.println("Digite o número do canal correto: ");
				numero = entrada.nextInt();
				cont12 += numero;
				break;
			default:
				System.out.println("Canal Invalido");
				cont--;
			}
			System.out.println("Digite o número do canal correto: ");
			canal = entrada.nextInt();
			cont++;
			
			totNumero= totNumero + numero;
		}
		System.out.println("");
		System.out.println("porcentagem do canal 4: " + fP.format ((double)cont4/cont));
		System.out.println("Porcentagem do canal 5: " + fP.format((double)cont5/cont));
		System.out.println("Porcentagem do canal 7: " + fP.format((double)cont7/cont));
		System.out.println("Porcentagem do canal 12: " + fP.format((double)cont12/cont));
		
		
	}

}
