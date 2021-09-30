// questão 04 - lê uma data e determina se é ano bissexto

import java.util.Calendar;
import java.util.Scanner;

public class q004 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Forma 1 - Verificando se o ano é divisivel por 4 e não divisível por 100 ou divisível por 400
		int ano;
		System.out.println("Escreva um ano com quatro dígitos");
		System.out.print("Ano: ");
		ano = entrada.nextInt();		
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) { 
			System.out.println("É ano bissexto");
		} else { 
			System.out.println("Não é ano bissexto");
		}
		
		// Forma 2 - Usando um método da classe Calendar
		Calendar bissexto = Calendar.getInstance ();
		int data;
		System.out.println("Escreva um ano com quatro dígitos.");
		System.out.print("Ano: ");
		data = entrada.nextInt();
		bissexto.set(Calendar.YEAR, data);
		if (bissexto.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
			System.out.println("É ano bissexto");
		} else {
			System.out.println("Não é ano bissexto");
		}
	}
}

/*
 * Referência Bibliográfica
 * 
 * COMO VERIFICAR SE UM ANO É BISSEXTO EM JAVA? Disponível em:
 * https://pt.stackoverflow.com/questions/495688/como-verificar-se-um-ano-%C3%A9-bissexto-em-java.
 * Acesso em: 30 set. 2021
 */