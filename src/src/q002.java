// questao 02 - lê um número e informa se é positivo, negativo ou zero

import java.util.Scanner;

public class q002 {
	public static void main (String [] args) { 
		Scanner entrada = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número.");
		System.out.print("Número: ");
		numero = entrada.nextInt();
		if (numero > 0) { 
			System.out.println("O número é positivo");
		} else if (numero < 0) {
			System.out.println("O número é negativo");
		} else { 
			System.out.println("O número é zero");
		} 
		}
}
