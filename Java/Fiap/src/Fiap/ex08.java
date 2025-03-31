package Fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		
		int matricula=0, frequencia=0;
		double nota1=0, nota2=0, nota3=0, media=0;
		
		for(int cont=1; cont<11;cont++) {
		System.out.println(cont + "aluno");
		System.out.println("Digite o número de mátricula: ");
		matricula=entrada.nextInt();
		
		System.out.println("Digite a primeira nota: ");
		nota1=entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2=entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3=entrada.nextDouble();
		System.out.println("Digite a quantidade de aulas que o aluno estava presente: ");
		frequencia=entrada.nextInt();
		
		media=((nota1+nota2+nota3) / 3);
		if(media>=6) {
			System.out.println("aprovado");
		}
		}
		
		
		
	}

}
