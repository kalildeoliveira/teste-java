// quest�o 21 - l� caracter F ou M e devolve Feminino ou Masculino

import java.util.Scanner;

public class q021 {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			String dataRecebida = "", opcao="", sim="S", nao="N";
			do {
			System.out.println("Digite uma data v�lida com dd/mm/aaaa.");
			System.out.print("Data: ");
			dataRecebida = entrada.nextLine();
			System.out.println("Voc� digitou a data :"+dataRecebida);
			System.out.println("Est� certa? Sim (S) ou N�o (N)?");
			System.out.print("Op��o: ");
			opcao = entrada.next();
			} while (opcao.equals(nao));
			System.out.println("Fim do Programa.");
	}
}
