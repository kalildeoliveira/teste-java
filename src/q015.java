// quest�o 15 -l� o pre�o e c�digo de um produto e retorna o pre�o junto com
//		Sul para o c�digo 1
//		Norte para o c�digo 2
//		Leste para o c�digo 3
//		Oeste para o c�digo 4
//		Nordeste para os c�digos 5 ou 6
//		Centro-oeste para os c�digos 7 ou 8
//		Importado para qualquer outro c�digo

import java.util.Scanner;

public class q015 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double preco=0;
		String opcao, sul="1", norte="2", leste="3", oeste="4", nordesteA="5", nordesteB="6", centroOesteA="7", centroOesteB="8";
		System.out.println("Informe o pre�o de custo e o c�digo de origem do produto.");
		System.out.print("Pre�o de custo: ");
		preco = entrada.nextDouble();
		System.out.print("C�digo de origem: ");
		opcao = entrada.next();
		if (opcao.equals(sul)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Sul");
		} else if (opcao.equals(norte)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Norte");
		} else if (opcao.equals(leste)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Leste");			
		} else if (opcao.equals(oeste)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Oeste");			
		} else if (opcao.equals(nordesteA)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Nordeste");			
		} else if (opcao.equals(nordesteB)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Nordeste");			
		} else if (opcao.equals(centroOesteA)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Centro Oeste");			
		} else if (opcao.equals(centroOesteB)) {
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Centro Oeste");
		} else { 
			System.out.println("O pre�o informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Proced�ncia do produto: Importado");
		}
	}
}