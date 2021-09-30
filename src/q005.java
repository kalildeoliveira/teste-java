// questão 05 - lê uma letra e verifica se é vogal

import java.util.Scanner;

public class q005 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra, a="a", e="e", i="i", o="o", u="u";
		System.out.println("Escreva uma letra para o sistema verificar.");
		System.out.print("Letra: ");
		letra = entrada.next();
		
		if (letra.equals(a)  || letra.equals(e) || letra.equals(i) || letra.equals(o) || letra.equals(u)) {
			System.out.println("É uma vogal");
		} else {
			System.out.println("Não é uma vogal");
		}
	}}

/*
 * Referência Bibliográfica
 * 
 * STRING NO JAVA: NÃO USE O OPERADOR IGUALDADE! Disponível em:
 * http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/.
 * Acesso em: 30 set. 2021
 */
