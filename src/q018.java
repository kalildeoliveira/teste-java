// questão 18 - lê os três lados de um triângulo e determina se é
//		Equilátero se os três lados forem iguais
//		Isósceles: se dois lados forem iguais
//		Escaleno: se todos os lados forem diferentes

import java.util.Scanner;

public class q018 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado1=0, lado2=0, lado3=0;		
		System.out.println("Informe os três lados de um triângulo");
		System.out.print("Lado 1: : ");
		lado1 = entrada.nextDouble();
		System.out.print("Lado 2: : ");
		lado2 = entrada.nextDouble();
		System.out.print("Lado 3: : ");
		lado3 = entrada.nextDouble();
		if (lado1==lado2 && lado2==lado3) {
			System.out.println("Triângulo Equilátero");
		} else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
	}
}
