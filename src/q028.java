// quest�o 28 - l� "sim" ou "n�o" na resposta a 5 perguntas e devolve: 
//		a) "Suspeita" se "sim" em 2 respostas;
//		b) "C�mplice" se "sim" em 3 ou 4 respostas;
//		c) "Assassino" se "sim" em 5 respostas
// 	Perguntas
//		(1) Telefonou para a v�tima?
//		(2) Esteve no local do crime?
//		(3) Mora perto da v�tima? 
//		(4) Devia para a v�tima? 
//		(5) J� trabahou para a v�tima?

import java.util.*;

public class q028 {
	public static void main (String[] args) { 
		Scanner entrada = new Scanner (System.in);
		String sim="S", nao="N";
		int contador=0, naoRespondeu=0;
		String [] opcao = new String[6];
		String [] pergunta = new String [6];
		pergunta [1] = "Telefonou para a v�tima?";
		pergunta [2] = "Esteve no local do crime?";
		pergunta [3] = "Mora perto da v�tima?";
		pergunta [4] = "Devia para a v�tima?";
		pergunta [5] = "J� trabalhou para a v�tima?";
		
		System.out.println("Responda a cinco perguntas com \"S\" para Sim ou \"N\" para N�o. ");
		
		// lendo as respostas
		for (int i=1; i<6; i++) {
			System.out.println("Pergunta "+i+": "+pergunta[i]);
			System.out.print("Resposta: ");
			opcao[i] = entrada.next();			
			if (opcao[i].equals(sim)) { 
				contador++;
			} else if (opcao[i].equals(nao)) {			
			} else { 
				System.out.println("Voc� deixou de responder uma pergunta. Reinicie");
				i=6; naoRespondeu=1;
			}
		}
		
		// relat�rio
		if (contador==2) { 
			System.out.println("\"Suspeita\"");
		} else if (contador==3 || contador==4) { 
			System.out.println("\"Cumplice\"");
		} else if (contador==5) { 
			System.out.println("Assassino");
		} else if (contador==0 && naoRespondeu==0) { 
			System.out.println("Inocente");
		}
	}
}
