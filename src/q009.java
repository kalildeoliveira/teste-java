// questão 09 - lê altura, peso e sexo e devolve peso ideal para homens e mulheres

import java.util.Scanner;

public class q009 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double altura=0, pesoIdeal=0, peso=0;
		String sexo, feminino="F", masculino="M"; 
		System.out.println("Informe a altura e peso para o cálculo do peso ideal");
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		System.out.print("Peso: ");
		peso = entrada.nextDouble();
		System.out.print("Agora informe F para Feminino ou M para Masculino");
		System.out.print("Sexo: ");
		sexo = entrada.next();
		
		if (sexo.equals(masculino)) { 
			pesoIdeal = ((72.7*altura)-58);
			System.out.println("Os dados informados foram: ");
			System.out.println("Altura: " + altura+" m");
			System.out.println("Peso: " + peso + " kg");
			System.out.println("Sexo: Masculino");
			System.out.println("O peso ideal para a altura informada: " + String.format("%.2f", pesoIdeal)+ " kg");
			if (pesoIdeal > peso) { 
				System.out.println("Você está abaixo do peso ideal");
			} else if (pesoIdeal == peso ) { 
				System.out.println("Você está no peso ideal");
			} else { 
				System.out.println("Você está acima do peso ideal");
			}
		} else { 
			pesoIdeal = ((62.1*altura)-44.7);
			System.out.println("Os dados informados foram: ");
			System.out.println("Altura: " + altura+ " m");
			System.out.println("Peso: " + peso + " kg");
			System.out.println("Sexo: Feminino");
			System.out.println("O peso ideal para a altura informada: " + String.format("%.2f", pesoIdeal) + " kg");
			if (pesoIdeal > peso) { 
				System.out.println("Você está abaixo do peso ideal");
			} else if (pesoIdeal == peso ) { 
				System.out.println("Você está no peso ideal");
			} else { 
				System.out.println("Você está acima do peso ideal");
			}
		}
	}
}