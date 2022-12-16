package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double dinheiro = scan.nextDouble();
		System.out.println("Quantas horas você trabalhou no mês?");
		int horas = scan.nextInt();
		
		double salario = dinheiro*horas;
		double inss = dinheiro*0.11;
		double sindicato = dinheiro*0.05;
		double salarioliq = salario - (inss+sindicato); 
		System.out.println("Salário Bruto: R$" + salario + " - INSS: (R$" + inss + ") - Sindicato (R$"
		+ sindicato + " = Salário Líquido: R$" + salarioliq);

	}

}
