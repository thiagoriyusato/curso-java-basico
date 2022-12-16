package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números inteiros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Digite um número real: ");
		double num3 = scan.nextDouble();
		
		double calc1 = (2*num1)*(num2/2);
		double calc2 = (3*num1) + num3;
		double calc3 = Math.pow(num3, 3);
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + calc1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calc2);
		System.out.println("O terceiro elevado ao cubo: " + calc3);
		
	}

}
