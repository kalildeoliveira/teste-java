// questão 32 - lê 10 respostas e devolve acerto ou erro conforme o gabarito:
//		1) a, 2) a, 3) b, 4) b, 5) c,
//		6) c, 7) d, 8) d, 9) e, 10) e.
//
//		relatório no formato
//			a) se acertou
//				"Q1: a: correto"
//			b) se errou
//				"Q2: b: errada, resposta correta(a)"
//			Pontuação Final: 9

import java.util.*;

public class q032 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		int contador=0;
		String [] perguntas = new String[11];
			perguntas[1]="Pergunta 1";
			perguntas[2]="Pergunta 2";
			perguntas[3]="Pergunta 3";
			perguntas[4]="Pergunta 4";
			perguntas[5]="Pergunta 5";
			perguntas[6]="Pergunta 6";
			perguntas[7]="Pergunta 7";
			perguntas[8]="Pergunta 8";
			perguntas[9]="Pergunta 9";
			perguntas[10]="Pergunta 10";
		String [] gabarito = new String[11];
			gabarito[1]="a";
			gabarito[2]="a";
			gabarito[3]="b";
			gabarito[4]="b";
			gabarito[5]="c";
			gabarito[6]="c";
			gabarito[7]="d";
			gabarito[8]="d";
			gabarito[9]="e";
			gabarito[10]="e";
		String [] respostas = new String[11];
		
		// respostas e relatório
		System.out.println(".:. Responda: \n"
				+ "  \"a\" para letra a\n"
				+ "  \"b\" para letra b\n"
				+ "  \"c\" para letra c\n"
				+ "  \"d\" para letra d\n"
				+ "  \"e\" para letra e\n");
		
			for (int i=1; i<11;i++) { 
				System.out.println("Pergunta "+i+": "+perguntas[i]);
				System.out.print(" Opção: ");
				respostas[i]=entrada.next();				
			}
			System.out.println("\n ::: RELATÓRIO ::: ");
			for (int i=1; i<11; i++) { 
				if (respostas[i].equals(gabarito[i])) { 
					contador++;
					System.out.println("Q"+i+": "+respostas[i]+": Correto");
				} else { 
					System.out.println("Q"+i+": "+respostas[i]+": Errada, resposta correta("+gabarito[i]+")");
				}
			}
			System.out.println("\nPontuação Final: "+contador);
	}
}
