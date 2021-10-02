// questão 16 - lê duas notas, calcula os conceitos
//		A para notas entre 9 e 10
//		B para notas entre 7,5 e 9
//		C para notas entre 6 e 7,5
//		D para notas entre 4 e 6
//		E para notas entre 0 e 4
// 	e devolve nota, média, conceito e as mensagens
//		Aprovado para os conceitos A, B ou C
//		Reprovado para os conceitos D ou E


import java.util.Scanner;

public class q017 {
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
		
		// relatorio
		System.out.println("\n::::::Relatorio::::::");
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Média: "+media);
		if (media>=9 && media<10) { 
			System.out.println("Conceito: A");
			System.out.println("Resultado: Aprovado");
		} else if (media>=7.5 && media<9) {
			System.out.println("Conceito: B");
			System.out.println("Resultado: Aprovado");
		} else if (media>=6 && media<7.5) { 
			System.out.println("Conceito: C");
			System.out.println("Resultado: Aprovado");
		} else if (media>=4 && media<6) { 
			System.out.println("Conceito: D");
			System.out.println("Resultado: Reprovado");
		} else if (media>=0 && media<4) { 
			System.out.println("Conceito: E");
			System.out.println("Resultado: Reprovado");
		}
	}
}