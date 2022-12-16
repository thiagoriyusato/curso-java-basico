package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto você ganha por hora: ");
		double salario = scan.nextDouble();
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salariomensal = horas*salario;
		System.out.println("Seu salário é R$" + salariomensal);

	}

}
