package Fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		// porcentage

		// repetição
		double peso = 0, altura = 0;
		int cont = 0, idade = 0, somaIdade = 0, quant50=0, quantIdade = 0, quantAzul = 0, quantRuiva = 0;
		char corOlho, corCabelo;

		for (cont = 0; cont < 2; cont++) {
			

		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println("Digite a sua altura: ");
		altura = entrada.nextDouble();
		System.out.println("Digite o seu peso: ");
		peso = entrada.nextDouble();

		System.out.println("Digite a cor dos olhos: ");
		corOlho = entrada.next().toUpperCase().charAt(0);

		while ((corOlho != 'A') && (corOlho != 'P') && (corOlho != 'V') && (corOlho != 'C')) {
			System.out.println("Digite a cor dos olhos corretamente: ");
			corOlho = entrada.next().toUpperCase().charAt(0);
		}

		System.out.println("Digite a cor do cabelo: ");
		corCabelo = entrada.next().toUpperCase().charAt(0);

		while ((corCabelo != 'p') && (corCabelo != 'C') && (corCabelo != 'L') && (corCabelo != 'R')) {
			System.out.println("Digite a cor dos cabelos corretamente: ");
			corCabelo = entrada.next().toUpperCase().charAt(0);
		}
		
		if(idade>50 && peso<60){
			quant50++;
		}
		if(altura<1.5) {
			quantIdade++;
		}
		
		if(corOlho == 'A') {
			quantAzul++;
		}
		
		if(corCabelo == 'R' && corOlho !='A') {
			quantRuiva++;
		}
		}
		System.out.println("A quantidade de pessoas com idade superior a 50 e peso inferior a 60 quilos: " + quant50);
		
		if(quantIdade !=0) {
			System.out.println("A média das pessoas com altura inferior a 1,50: " + somaIdade / quantIdade);	
		}
		else {
			System.out.println("A média das idades das pessoas com altura inferior a 1,50: 0");
		}
		System.out.println("A porcentagem das pessoas com olhos azuis entre todas as pessoas analizadas: " + fP.format ((double) quantAzul / cont));
		
		System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis: " + quantRuiva);
	}

}
