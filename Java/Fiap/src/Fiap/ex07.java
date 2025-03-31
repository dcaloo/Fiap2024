package Fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		
		int id=0, cont=0;
		double contPessoas=0, contA=0,contB=0, contC=0, contD=0, contE=0, sumIdade=0;
		char op;
		
		System.out.println("Digite a sua idade: ");
		id=entrada.nextInt();
		
		while(id != 0) {
			contPessoas++;
			sumIdade=id;
			System.out.println("Digite a sua opinião:");
			op=entrada.next().toUpperCase().charAt(0);
			while((op !='A') && (op!= 'B') && (op!= 'c') && (op!= 'D') && (op!='E')) {
				System.out.println("Digite a opinião correta: A/B/C/D/E");
				op=entrada.next().toUpperCase().charAt(0);
			}
			switch(op) {
			case 'A':
				contA++;
			case 'B':
				contB++;
			case 'C':
				contC++;
			case 'D':
				contD++;
			case 'E':
				contE++;
				break;
			}
			
			System.out.println("Digite a sua idade: ");
			id=entrada.nextInt();
			
		}
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("A quantidade de pessoas que respondeu a pesquisa foi de: " + contPessoas);
		System.out.println("a média da idade das pessoas que respondeu foi de: " + fP.format((double)sumIdade/contPessoas));
		System.out.println("A porcentagem da opinião A foi de: " + contA);
		System.out.println("A porcentagem da opinião B foi de: "  );
		System.out.println("A porcentagem da opinião C foi de: "  );
		System.out.println("A porcentagem da opinião D foi de: "  );
		System.out.println("A porcentagem da opinião E foi de: "  );
		
	}

}
