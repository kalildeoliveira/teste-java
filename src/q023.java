// questão 23 - lê três idades e devolve: 
//		a) "Turma jovem" se media < 25;
//		b) "Turma adulta" se media > 25 e media < 40;
//		c) "Turma idosa" se media > 40

import java.util.Scanner;

public class q023 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade1, idade2, idade3, media;
		System.out.println("Informe três idades.");
		System.out.print("Idade 1: ");
		idade1 = entrada.nextInt();
		System.out.print("Idade 2: ");
		idade2 = entrada.nextInt();
		System.out.print("Idade 3: ");
		idade3 = entrada.nextInt();
		media = (idade1+idade2+idade3)/3;
		if (media < 25) {
			System.out.println("Turma jovem");
		} else if (media > 25 && media < 40) {
			System.out.println("Turma adulta");
		} else if (media > 40) {
			System.out.println("Turma idosa");
		} else { 
			System.out.println("Valores incorretos!");
		}
	}
}