// quest�o 03 - l� caracter F ou M e devolve Feminino ou Masculino

import java.util.Scanner;

public class q003 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao, feminino = "F", masculino = "M";
		System.out.println("Escreva F para Feminino ou M para Masculino.");
		System.out.print("Op��o: ");
		opcao = entrada.next();
		if (opcao.equals(feminino)) {
			System.out.println("A op��o foi Feminino");
		} else if (opcao.equals(masculino)) {
			System.out.println("A op��o foi Masculino");
		} else {
			System.out.println("Op��o inv�lida!");
		}
	}
}

/*
 * Refer�ncia Bibliogr�fica
 * 
 * STRING NO JAVA: N�O USE O OPERADOR IGUALDADE! Dispon�vel em:
 * http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/.
 * Acesso em: 30 set. 2021
 */