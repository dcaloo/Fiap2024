package Fiap;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero=0, maior=0, menor=0;
		for (int cont=0;cont<10;cont++) {
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			
			if(numero>maior) {
				maior=numero;
			}
			
			if(cont == 0) {
				menor = numero;
			}else
				if(numero<menor) {
					menor=numero;
				}
		}
		
		System.out.println("Maior Numero: " + maior);
		System.out.println("Menor numero: " + menor);
	}

}
