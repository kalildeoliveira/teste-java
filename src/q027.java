// quest�o 27 - l� dois n�meros e devolve, � escolha do usu�rio, se �:  
// 		a) par ou impar
//		b) positivo ou negativo
//		c) inteiro ou decimal

import java.util.*;

public class q027 {
	public static void main (String[] args) { 
		Scanner entrada = new Scanner (System.in);
		double numero1=0, numero2=0;		
		String opcao="", a="A", b="B", c="C";
		System.out.println("Informe dois n�meros inteiros ou decimais.");
		System.out.print("N�mero 1: ");
		numero1 = entrada.nextDouble();
		System.out.print("N�mero 2: ");
		numero2 = entrada.nextDouble();
		System.out.println("\nO que deseja saber?");
		System.out.println("\tDigite \"A\" - para descobrir se � par ou impar");
		System.out.println("\tDigite \"B\" - para descobrir se � positivo ou negativo");
		System.out.println("\tDigite \"C\" - para descobrir se � inteiro ou decimal");
		System.out.print("\tOp��o: ");
		opcao = entrada.next();
		
		// a)		
		if (opcao.equals(a)) {			
			if (numero1%2==0) { 
				System.out.print("O n�mero "+numero1+" � par e");				
			} else { 
				System.out.print("O n�mero "+numero1+" � impar e");				
			}			
			if (numero2%2==0) { 
				System.out.print(" o n�mero "+numero2+" � par");
			} else { 
				System.out.print(" o n�mero "+numero2+" � impar");				
			}			
		}
		
		// b) 
		if (opcao.equals(b)) { 
			if (numero1<0) { 
				System.out.print("O n�mero "+numero1+" � negativo e");				
			} else { 
				System.out.print("O n�mero "+numero1+" � positivo e");				
			}			
			if (numero2<0) { 
				System.out.print(" o n�mero "+numero2+" � negativor");
			} else { 
				System.out.print(" o n�mero "+numero2+" � positivo");				
			}			
		}
		
		// c)
		if (opcao.equals(c)) { 
			if (numero1%1==0) { 
				System.out.print("O n�mero "+numero1+" � inteiro e");				
			} else { 
				System.out.print("O n�mero "+numero1+" � decimal e");				
			}			
			if (numero2%1==0) { 
				System.out.print(" o n�mero "+numero2+" � inteiro");
			} else { 
				System.out.print(" o n�mero "+numero2+" � decimal");				
			}			
		}
	}
}
