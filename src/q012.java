// questão 12 -  lê o salário, devolve o reajuste do aumento de:
//		20% para salário menor ou igual a R$ 280
//		15% para salário entre R$ 280 e R$ 700
//		10% para salário entre R$ 700 e R$ 1500
//		5% para salário acima de R$ 1500
//	e relatório com salário antes do reajuste, percentual aplicado,valor do aumento e novo salário. 

import java.util.Scanner;

public class q012 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario=0, valorAumento=0, novoSalario=0; 
		int relatorioAumento=0;
		System.out.println("Informe o salário para o cálculo do reajuste.");
		System.out.print("Salário: ");		
		salario = entrada.nextDouble();
		
		// reajuste
		if (salario<=280) {
			novoSalario = salario*1.20;
			relatorioAumento = 20;
			valorAumento = salario*0.20;
		} else if (salario > 280 && salario < 700) {
			novoSalario = salario*1.15;
			relatorioAumento = 15;
			valorAumento = salario*0.15;
		} else if (salario > 700 && salario < 1500) {
			novoSalario = salario*1.10;
			relatorioAumento = 10;
			valorAumento = salario*0.10;
		} else if (salario > 1500) {
			novoSalario = salario*1.05;
			relatorioAumento = 5;
			valorAumento = salario*0.05;
		} else { 
			System.out.println("Dados Incorretos!");
		}
		
		// relatorio
		System.out.println("Salario antes do reajuste : R$ "+ String.format("%.2f", salario));
		System.out.println("Percentual aplicado : "+relatorioAumento+"%");
		System.out.println("Valor do aumento : R$ "+ String.format("%.2f", valorAumento));
		System.out.println("Novo salario, após o aumento : R$ "+ String.format("%.2f", novoSalario));
	}
}