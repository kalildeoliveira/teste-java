// questão 03 - lê caracter F ou M e devolve Feminino ou Masculino

import java.util.Scanner;

public class q003 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao, feminino = "F", masculino = "M";
		System.out.println("Escreva F para Feminino ou M para Masculino.");
		System.out.print("Opção: ");
		opcao = entrada.next();
		if (opcao.equals(feminino)) {
			System.out.println("A opção foi Feminino");
		} else if (opcao.equals(masculino)) {
			System.out.println("A opção foi Masculino");
		} else {
			System.out.println("Opção inválida!");
		}
	}
}

/*
 * Referência Bibliográfica
 * 
 * STRING NO JAVA: NÃO USE O OPERADOR IGUALDADE! Disponível em:
 * http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/.
 * Acesso em: 30 set. 2021
 */