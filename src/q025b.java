// quest�o 25-B l� um n�mero inteiro e devolve se � par ou impar

import java.util.*;

public class q025b {
	public static void main (String [] args) { 
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		System.out.println("Informe um n�mero inteiro.");
		System.out.print("N�mero: ");
		numero = entrada.nextInt();
		if (numero%2 ==0) { 
			System.out.println("O n�mero � par");
		} else { 
			System.out.println("O n�mero � impar");
		}
	}

}
