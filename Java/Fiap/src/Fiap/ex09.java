package Fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");
		
		double precoCarro=0,total=0;
		int perc=0;
		
		System.out.println("Digite o preço do carro: ");
		precoCarro=entrada.nextDouble();
		
		//20% de desconto a vista
		System.out.println("preço final à vista: "+precoCarro*0.80);
		
		//tabela com acrescimo
		for(int i=6;i<66;i+=6) {
			perc+=3;
			total=precoCarro + (precoCarro * perc / 100);
			System.out.println("O preço final parcelado em " + i + " X é de " + fM.format(total) + " com parcelas de: " + fM.format(total/i));
		}//for
		
		
	}

}
