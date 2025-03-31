package Fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		
		int meses=0, totalCriancas=0, cont=0;
		char sexo;
		double quantM=0, quantF=0, quantMenor=0;
		
		
		
		System.out.println("Quantas Crianças foram nascidas?");
		totalCriancas=entrada.nextInt();
		
		for(cont=0 ; cont < totalCriancas; cont++) {
		System.out.println("Por quantos meses a criança viveu?");
		meses=entrada.nextInt();
		
		System.out.println("Qual é o sexo de cada pessoa nascida?");
		sexo=entrada.next().toUpperCase().charAt(0);
		
		while ((sexo != 'M') && (sexo !='F')) {
			System.out.println("Digite o sexo Corretamente:");
			sexo=entrada.next().toUpperCase().charAt(0);
		}
		
		if(sexo == 'M') {
			quantM++;
		}else {
			quantF++;
		}
		
		if (meses < 24) {
			quantMenor++;
		}
		
		
		}
		System.out.println("A Porcentagem de crianças do sexo feminino mortas nesse periodo foi de: " + fP.format ((double) quantF/cont));
		System.out.println("A porcentagem de crianças do sexo Masculino mortas nesse período foi de: " + fP.format((double) quantM/cont));
		System.out.println("A porcentagem de crianças que viveram 24 meses ou menos no período foi de: " + quantMenor);
		

		
	}

}
