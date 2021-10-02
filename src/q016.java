// questão 16 - lê duas notas e devolve
//		Reprovado para notas entre 0 e 3
//		Em Exame para notas entre 3 e 6.9
//		Aprovado para notas entre 7 e 10

import java.util.Scanner;

public class q016 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1=0, nota2=0, media=0;		
		System.out.println("Informe duas notas parciais.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();
		
		// calculo da média
		media = (nota1+nota2)/2;
		
		if ((media>0) && (media<3)) { 
			System.out.println("Reprovado");
		} else if ((media>3) && (media<6.9)) {
			System.out.println("Em Exame");
		} else if ((media>7) && (media<10)) { 
			System.out.println("Aprovado");
		}		
	}
}