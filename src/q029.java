// quest�o 29 - l� n�mero de litros vendidos, tipo de combust�vel e devolve o valor a ser pago com pre�o:
//		A - �lcool 
//			a) R$ 1,90 sem desconto
//			b) - 3% at� 20 litros
//			c) - 5% acima de 20 litros
//		G - Gasolina
//			a) R$ 2,50 sem desconto
//			b) - 4% at� 20 litros
//			c) - 6% acima de 20 litros

import java.util.*;

public class q029 {
	public static void main (String[]args) { 
		Scanner entrada = new Scanner (System.in);
		String opcao="", alcool="A", gasolina="G";
		int litros;
		double precoA=1.9, precoG=2.5;
		System.out.println("Informe o tipo de combust�vel.");
		System.out.println("\"A\" - para �lcool ou \n\"G\" - para Gasolina");
		System.out.print("Opcao: ");
		opcao = entrada.next();
		System.out.println("\nAgora informe a quantidade de litros.");
		System.out.print("Quantidade: ");
		litros = entrada.nextInt();
		if (opcao.equals(alcool)) { 
			if (litros<20) {				
				precoA=litros*(precoA-precoA*0.03);
			} else if (litros>20) { 
				precoA=litros*(precoA-precoA*0.05);
			}
		}
		if (opcao.equals(gasolina)) { 
			if (litros<20) { 
				precoG=litros*(precoG-precoG*0.04);
			} else if (litros>20) { 
				precoG=litros*(precoG-precoG*0.06);
			}
		}
		
		// relat�rio
		if (opcao.equals(alcool)) { 
			System.out.println("\nA-�lcool a pagar: R$ "+String.format("%.2f", precoA));
		}
		if (opcao.equals(gasolina)) { 
			System.out.println("\nG-gasolina a pagar: R$ "+String.format("%.2f", precoG));
		}
	}
}
