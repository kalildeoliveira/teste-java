// quest�o 06 - l� um n�mero transformando-o em par ou impar

import java.util.Scanner;

public class q006 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, troca;
		System.out.println("Escreva um n�mero para convers�o.");
		System.out.print("N�mero: ");
		numero = entrada.nextInt();
		if (numero%2 == 0) {
			troca = numero+1;
			System.out.println("Seu n�mero " + numero + " era par e agora � �mpar: " + troca);
		} else {
			troca = numero+1;
			System.out.println("Seu n�mero " + numero + " era �mpar e agora � par: " + troca);
		}
	}
}
