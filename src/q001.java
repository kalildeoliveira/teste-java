// questao 01 - lê dois numeros e imprime o maior

import java.util.Scanner;

public class q001 {
	public static void main (String [] args) { 
		Scanner entrada = new Scanner (System.in);
		int numero1, numero2, maior=0;
		System.out.println("Digite dois números.");
		System.out.print("Numero1: ");
		numero1 = entrada.nextInt();
		System.out.print("Numero2: ");
		numero2 = entrada.nextInt();
		if (numero1 > numero2) { 
			maior = numero1;
		} else {
			maior=numero2;
		}
		System.out.println("\nO maior número é " + maior);
		}
}
