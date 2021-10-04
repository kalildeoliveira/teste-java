// questão 27 - lê dois números e devolve, à escolha do usuário, se é:  
// 		a) par ou impar
//		b) positivo ou negativo
//		c) inteiro ou decimal

import java.util.*;

public class q027 {
	public static void main (String[] args) { 
		Scanner entrada = new Scanner (System.in);
		double numero1=0, numero2=0;		
		String opcao="", a="A", b="B", c="C";
		System.out.println("Informe dois números inteiros ou decimais.");
		System.out.print("Número 1: ");
		numero1 = entrada.nextDouble();
		System.out.print("Número 2: ");
		numero2 = entrada.nextDouble();
		System.out.println("\nO que deseja saber?");
		System.out.println("\tDigite \"A\" - para descobrir se é par ou impar");
		System.out.println("\tDigite \"B\" - para descobrir se é positivo ou negativo");
		System.out.println("\tDigite \"C\" - para descobrir se é inteiro ou decimal");
		System.out.print("\tOpção: ");
		opcao = entrada.next();
		
		// a)		
		if (opcao.equals(a)) {			
			if (numero1%2==0) { 
				System.out.print("O número "+numero1+" é par e");				
			} else { 
				System.out.print("O número "+numero1+" é impar e");				
			}			
			if (numero2%2==0) { 
				System.out.print(" o número "+numero2+" é par");
			} else { 
				System.out.print(" o número "+numero2+" é impar");				
			}			
		}
		
		// b) 
		if (opcao.equals(b)) { 
			if (numero1<0) { 
				System.out.print("O número "+numero1+" é negativo e");				
			} else { 
				System.out.print("O número "+numero1+" é positivo e");				
			}			
			if (numero2<0) { 
				System.out.print(" o número "+numero2+" é negativor");
			} else { 
				System.out.print(" o número "+numero2+" é positivo");				
			}			
		}
		
		// c)
		if (opcao.equals(c)) { 
			if (numero1%1==0) { 
				System.out.print("O número "+numero1+" é inteiro e");				
			} else { 
				System.out.print("O número "+numero1+" é decimal e");				
			}			
			if (numero2%1==0) { 
				System.out.print(" o número "+numero2+" é inteiro");
			} else { 
				System.out.print(" o número "+numero2+" é decimal");				
			}			
		}
	}
}
