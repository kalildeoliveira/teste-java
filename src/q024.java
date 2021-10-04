// questão 24 - lê três notas parciais e devolve a média e:
//		a) "Aprovado" se media >=7 e media < 10;
//		b) "Reprovado" se media < 7;
//		c) "Aprovado com Distinção" se media == 10;

import java.util.Scanner;

public class q024 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Informe três notas parciais do aluno.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = entrada.nextDouble();
		
		// cálculo da média
		media = (nota1+nota2+nota3)/3;
		
		if (media >=7 && media < 10) {
			System.out.println("Aprovado. \nMédia: "+(String.format("%.2f", media)));
		} else if (media<7) {
			System.out.println("Reprovado. \nMédia: "+(String.format("%.2f", media)));
		} else if (media==10) {
			System.out.println("Aprovado com Distinção.");
		} else { 
			System.out.println("Dados incorretos!");
		}
	}
}