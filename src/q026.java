// quest�o 26 - l� um n�mero e devolve se � inteiro ou decimal.

import java.util.*;

public class q026 {
	public static void main (String[] args) { 
		Scanner entrada = new Scanner (System.in);
		double numero=0;
		System.out.println("Informe um n�mero inteiro ou decimal.");
		System.out.print("N�mero: ");
		numero = entrada.nextDouble();
		numero = numero%1;
		if (numero!=0) { 
			System.out.println("O n�mero � decimal");
		} else { 
			System.out.println("� um n�mero inteiro");
		}
	}

}
