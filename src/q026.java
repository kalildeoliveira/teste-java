// questão 26 - lê um número e devolve se é inteiro ou decimal.

import java.util.*;

public class q026 {
	public static void main (String[] args) { 
		Scanner entrada = new Scanner (System.in);
		double numero=0;
		System.out.println("Informe um número inteiro ou decimal.");
		System.out.print("Número: ");
		numero = entrada.nextDouble();
		numero = numero%1;
		if (numero!=0) { 
			System.out.println("O número é decimal");
		} else { 
			System.out.println("É um número inteiro");
		}
	}

}
