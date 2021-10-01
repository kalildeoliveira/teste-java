// questão 08 - lê duas notas e devolve aprovação ou reprovação

import java.util.Scanner;

public class q008 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1=0, nota2=0;		
		System.out.println("Informe duas notas parciais.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();		
		if (((nota1+nota2)/2) < 7) { 
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
	}
}
