// quest�o 10 - l� tr�s n�meros e informa o maior e menor

import java.util.Scanner;

public class q010 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero [] = new int [4];
		int maior=0, menor=0;
		System.out.println("Informe tr�s n�meros inteiros.");
		for (int i=1; i<4; i++) { 			
			System.out.print("N�mero "+i+" : ");
			numero[i] = entrada.nextInt();
		}
		
		// Maior		
		for (int i=1; i<4; i++) {
			if (maior==0) { 
				maior=numero[i];
			} else if (numero[i] > maior) { 
					maior = numero[i];
				}
		}
		
		// Menor
		for (int i=1; i<4; i++) {
			if (menor==0) { 
				menor=numero[i];
			} else if (numero[i] < menor) { 
					menor = numero[i];
				}
		}
		
		System.out.println("Maior n�mero: "+maior);
		System.out.println("Menor n�mero: "+menor);
		
	}
}