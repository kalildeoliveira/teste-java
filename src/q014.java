// quest�o 14 -l� um n�mero e mostra o dia correspondente da semana 

import java.util.Scanner;

public class q014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		String opcao, domingo="1", segunda="2", terca="3", quarta="4", quinta="5", sexta="6", sabado="7";
		System.out.println("Informe um n�mero entre 1 e 7 para selecionar um dia da semana.");
		System.out.print("Op��o: ");
		opcao = entrada.next();
		if (opcao.equals(domingo)) {
			System.out.println("A op��o foi Domingo");
		} else if (opcao.equals(segunda)) {
			System.out.println("A op��o foi Segunda");
		} else if (opcao.equals(terca)) {
			System.out.println("A op��o foi Ter�a");			
		} else if (opcao.equals(quarta)) {
			System.out.println("A op��o foi Quarta");			
		} else if (opcao.equals(quinta)) {
			System.out.println("A op��o foi Quinta");			
		} else if (opcao.equals(sexta)) {
			System.out.println("A op��o foi Sexta");			
		} else if (opcao.equals(sabado)) {
			System.out.println("A op��o foi S�bado");			
		} else {
			System.out.println("Valor inv�lido!");
		}
	}
}