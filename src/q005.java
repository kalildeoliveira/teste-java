// quest�o 05 - l� uma letra e verifica se � vogal

import java.util.Scanner;

public class q005 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra, a="a", e="e", i="i", o="o", u="u";
		System.out.println("Escreva uma letra para o sistema verificar.");
		System.out.print("Letra: ");
		letra = entrada.next();
		
		if (letra.equals(a)  || letra.equals(e) || letra.equals(i) || letra.equals(o) || letra.equals(u)) {
			System.out.println("� uma vogal");
		} else {
			System.out.println("N�o � uma vogal");
		}
	}}

/*
 * Refer�ncia Bibliogr�fica
 * 
 * STRING NO JAVA: N�O USE O OPERADOR IGUALDADE! Dispon�vel em:
 * http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/.
 * Acesso em: 30 set. 2021
 */
