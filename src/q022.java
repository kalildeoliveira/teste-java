// questão 22 - lê número inteiro menor que 1000 e devolve as centenas, dezenas e unidades.
//		Testar com: 
//			a) 326, 
//			b) 300, 
//			c) 100, 
//			d) 320, 
//			e) 310, 
//			f) 305, 
//			g) 301, 
//			h) 101, 
//			i) 311, 
//			j) 111, 
//			k) 25, 
//			l) 20, 
//			m) 10, 
//			n) 21, 
//			o) 11, 
//			p) 1, 
//			q) 7 e 
//			r) 16

import java.util.Scanner;

public class q022 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int centena, dezena, unidade, num;
		System.out.println("Informe um número inteiro menor que 1000.");
		System.out.print("Número: ");
		num=entrada.nextInt();
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println("\n   ::: Você digitou ::: ");
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// Outros números
		System.out.println("\n   ::: Veja estes testes com outros números :::\n ");
		
		// a)
		num=326;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");

		// b)
		num=300;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// c)
		num=100;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// d)
		num=320;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// e)
		num=310;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// f)
		num=305;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// g)
		num=101;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// h)
		num=311;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// i)
		num=111;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// j)
		num=25;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// k)
		num=20;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// l)
		num=10;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// m)
		num=21;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// n)
		num=11;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// o)
		num=11;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// p)
		num=1;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// q)
		num=7;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// r)
		num=16;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");		
	}
}

/*
 * Referência Bibliográfica
 * 
 * MOSTRAR - DEZENAS -CENTENAS E UNIDADES, SEPARADOS Disponível em:
 * https://www.devmedia.com.br/forum/mostra-dezenas-centenas-e-unidades-separados/565141.
 * Acesso em: 04 out. 2021
 */