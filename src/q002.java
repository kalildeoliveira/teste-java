// questao 02 - l� um n�mero e informa se � positivo, negativo ou zero

import java.util.Scanner;

public class q002 {
	public static void main (String [] args) { 
		Scanner entrada = new Scanner (System.in);
		int numero;
		System.out.println("Digite um n�mero.");
		System.out.print("N�mero: ");
		numero = entrada.nextInt();
		if (numero > 0) { 
			System.out.println("O n�mero � positivo");
		} else if (numero < 0) {
			System.out.println("O n�mero � negativo");
		} else { 
			System.out.println("O n�mero � zero");
		} 
		}
}
