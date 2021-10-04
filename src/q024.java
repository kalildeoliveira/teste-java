// quest�o 24 - l� tr�s notas parciais e devolve a m�dia e:
//		a) "Aprovado" se media >=7 e media < 10;
//		b) "Reprovado" se media < 7;
//		c) "Aprovado com Distin��o" se media == 10;

import java.util.Scanner;

public class q024 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Informe tr�s notas parciais do aluno.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = entrada.nextDouble();
		
		// c�lculo da m�dia
		media = (nota1+nota2+nota3)/3;
		
		if (media >=7 && media < 10) {
			System.out.println("Aprovado. \nM�dia: "+(String.format("%.2f", media)));
		} else if (media<7) {
			System.out.println("Reprovado. \nM�dia: "+(String.format("%.2f", media)));
		} else if (media==10) {
			System.out.println("Aprovado com Distin��o.");
		} else { 
			System.out.println("Dados incorretos!");
		}
	}
}