// questão 30 - lê a quantidade de morango e maçã e devolve preço final com 				
//			Morango
//				a) R$ 2,50/kg até 5 kg
//				b) R$ 2,20 acima de 5 kg
//			Maçã
//				a) R$ 1,80/kg até 5 kg
//				b) R$ 1,50 acima de 5 kg
// 			e desconto de 10% para compra acima de 8kg ou R$ 25,00

import java.util.*;

public class q030 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double quilosMorango=0, quilosMaca=0, quilosSoma=0, precoMorango=2.5, precoMaca=1.8, precoSoma=0;
		System.out.println("Informe a quantidade de Morango e Maçã em kg.");
		System.out.print("Morango: ");
		quilosMorango = entrada.nextDouble();
		System.out.print("Maçã: ");
		quilosMaca = entrada.nextDouble();
		
		// cálculos
		quilosSoma=quilosMorango+quilosMaca;
		if (quilosMorango>5) { 
			precoMorango=quilosMorango*(precoMorango-0.3);
		} else  { 
			precoMorango=quilosMorango*precoMorango;
		}
		if (quilosMaca>5) { 
			precoMaca=quilosMaca*(precoMaca-0.3);
		} else { 
			precoMaca=quilosMaca*precoMaca;
		}
		precoSoma=precoMorango+precoMaca;
		if (precoSoma > 25 || quilosSoma > 8) { 
			precoSoma=precoSoma-(precoSoma*0.10);
		}
		
		// relatório
		System.out.println("Total a pagar: "+String.format("%.2f", precoSoma));
	}

}
