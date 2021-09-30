// quest�o 04 - l� uma data e determina se � ano bissexto

import java.util.Calendar;
import java.util.Scanner;

public class q004 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Forma 1 - Verificando se o ano � divisivel por 4 e n�o divis�vel por 100 ou divis�vel por 400
		int ano;
		System.out.println("Escreva um ano com quatro d�gitos");
		System.out.print("Ano: ");
		ano = entrada.nextInt();		
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) { 
			System.out.println("� ano bissexto");
		} else { 
			System.out.println("N�o � ano bissexto");
		}
		
		// Forma 2 - Usando um m�todo da classe Calendar
		Calendar bissexto = Calendar.getInstance ();
		int data;
		System.out.println("Escreva um ano com quatro d�gitos.");
		System.out.print("Ano: ");
		data = entrada.nextInt();
		bissexto.set(Calendar.YEAR, data);
		if (bissexto.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
			System.out.println("� ano bissexto");
		} else {
			System.out.println("N�o � ano bissexto");
		}
	}
}

/*
 * Refer�ncia Bibliogr�fica
 * 
 * COMO VERIFICAR SE UM ANO � BISSEXTO EM JAVA? Dispon�vel em:
 * https://pt.stackoverflow.com/questions/495688/como-verificar-se-um-ano-%C3%A9-bissexto-em-java.
 * Acesso em: 30 set. 2021
 */