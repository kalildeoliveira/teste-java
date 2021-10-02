// questão 14 -lê um número e mostra o dia correspondente da semana 

import java.util.Scanner;

public class q014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		String opcao, domingo="1", segunda="2", terca="3", quarta="4", quinta="5", sexta="6", sabado="7";
		System.out.println("Informe um número entre 1 e 7 para selecionar um dia da semana.");
		System.out.print("Opção: ");
		opcao = entrada.next();
		if (opcao.equals(domingo)) {
			System.out.println("A opção foi Domingo");
		} else if (opcao.equals(segunda)) {
			System.out.println("A opção foi Segunda");
		} else if (opcao.equals(terca)) {
			System.out.println("A opção foi Terça");			
		} else if (opcao.equals(quarta)) {
			System.out.println("A opção foi Quarta");			
		} else if (opcao.equals(quinta)) {
			System.out.println("A opção foi Quinta");			
		} else if (opcao.equals(sexta)) {
			System.out.println("A opção foi Sexta");			
		} else if (opcao.equals(sabado)) {
			System.out.println("A opção foi Sábado");			
		} else {
			System.out.println("Valor inválido!");
		}
	}
}