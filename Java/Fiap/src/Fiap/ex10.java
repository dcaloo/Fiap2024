package Fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("##0.00");
		
		int cont=0, contItens=0;
		double pe=0, total=0;
		
		
		
		
		
		
		//variaveis
		String resp="sim";
				
		
		//repetição compras
		while(resp.equalsIgnoreCase("sim")) {
			System.out.println((cont+1)+" compra");
			cont++;
			//precisa zerar a variavel para outra conta
			total=0;
			contItens=0;
			System.out.println("Digite o preço da etiqueta: ");
			pe=entrada.nextDouble();
			
			//repetição itens da compra PE
			while(pe !=0) {
				
				total+=pe;
				contItens++;
				
				System.out.println("Digite o preço da etiqueta: ");
				pe=entrada.nextDouble();
			}//while pe
			
			System.out.println("Valor total: " +total);
			System.out.println("Qtd itens: " + contItens);
			
			
			
			
			
			
			
			
			System.out.println("deseja cadastrar nova compra sim/não?");
			resp=entrada.next();
			
			
		
		}
		
		
	}

}
