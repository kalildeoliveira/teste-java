// quest�o 31 - l� o tipo- uma para cada cliente -, quantidade de carne e forma de pagamento e devolve: 
//			a) tipo, 
//			b) quantidade, 
//			c) soma dos pre�os, 
//			d) tipo de pagamento, 
//			e) desconto total e 
//			f) pre�o total
// 		de acordo com a tabela de pre�o:
//			Fil� duplo
//				a) R$ 4,90 at� 5kg
//				b) R$ 5,80 acima de 5kg
//			Alcatra 
//				a) R$ 5,90 at� 5kg
//				b) R$ 6,80 acima de 5kg
//			Picanha
//				a) R$ 6,90 at� 5 kg
//				b) R$ 7,80 acima de 5kg
//		com desconto de 5% no cart�o
//

import java.util.*;

public class q031 {
	public static void main (String[]args) { 
		Scanner entrada = new Scanner(System.in);
		String opcao="", fileDuplo="F", alcatra="A", picanha="P", opcaoCartao="", cartao="S", tipoDeCarne="", tipoPagamento="Cartao";
		double quilosDeCarne=0, precoFileDuplo=4.9, precoAlcatra=5.9, precoPicanha=6.9, precoSoma=0, desconto=0, precoDesconto=0;
		System.out.println("Informe o tipo de carne que gostaria de comprar.");
		System.out.println("\"F\"- para Fil� duplo\n\"A\"- para Alcatra\n\"P\"- para Picanha");
		System.out.print("Op��o: ");
		opcao = entrada.next();
		
		// c�lculos
		if (opcao.equals(fileDuplo)) { 
			tipoDeCarne = "Fil� Duplo";
			System.out.println("\nQual a quantidade em kg?");
			System.out.print("Quantidade: ");
			quilosDeCarne=entrada.nextDouble();
			if (quilosDeCarne>5) { 
				precoSoma=quilosDeCarne*(precoFileDuplo+0.9);
			} else { 
				precoSoma=precoFileDuplo = quilosDeCarne*precoFileDuplo;
			}
		} else if (opcao.equals(alcatra)) { 
			tipoDeCarne = "Alcatra";
			System.out.println("\nQual a quantidade em kg?");
			System.out.print("Quantidade: ");
			quilosDeCarne=entrada.nextDouble();
			if (quilosDeCarne>5) { 
				precoSoma=quilosDeCarne*(precoAlcatra+0.9);
			} else { 
				precoSoma=quilosDeCarne*precoAlcatra;
			}
		} else if (opcao.equals(picanha)) { 
			tipoDeCarne = "Picanha";
			System.out.println("\nQual a quantidade em kg?");
			System.out.print("Quantidade: ");
			quilosDeCarne=entrada.nextDouble();
			if (quilosDeCarne>5) { 
				precoSoma=quilosDeCarne*(precoPicanha+0.9);
			} else { 
				precoSoma=quilosDeCarne*precoPicanha;
			}
		}
		
		// desconto com cart�o 
		System.out.println("\nDeseja pagar com cart�o Tabajara?");
		System.out.println("Digite \"S\"-Sim ou \"N\"-N�o");
		System.out.print("Op��o: ");
		opcaoCartao=entrada.next();
		if (opcaoCartao.equals(cartao)) { 
			desconto=precoSoma*0.05;
			precoDesconto = precoSoma-desconto;
		} else { 
			tipoPagamento="Outro";
		} 
//				
		// relat�rio
		System.out.println("\n:::: RELAT�RIO DA COMPRA::: ");
		System.out.println("Tipo de Carne: "+tipoDeCarne);
		System.out.println("Quantidade: "+quilosDeCarne);
		System.out.println("Total bruto: "+String.format("%.2f", precoSoma));
		System.out.println("Tipo de pagamento: "+tipoPagamento);
		System.out.println("Descontos: "+String.format("%.2f",desconto));
		System.out.println("Pre�o total: "+String.format("%.2f", precoDesconto));		
	}
}
