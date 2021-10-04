// questão 21 - lê caracter F ou M e devolve Feminino ou Masculino

import java.util.Scanner;

public class q021 {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String dataRecebida = "", opcao="", sim="S", nao="N";
			do {
			System.out.println("Digite uma data válida com dd/mm/aaaa.");
			System.out.print("Data: ");
			dataRecebida = entrada.nextLine();
			System.out.println("Você digitou a data :"+dataRecebida);
			System.out.println("Está certa? Sim (S) ou Não (N)?");
			System.out.print("Opção: ");
			opcao = entrada.next();
			} while (opcao.equals(nao));
			System.out.println("Fim do Programa.");
	}
}
