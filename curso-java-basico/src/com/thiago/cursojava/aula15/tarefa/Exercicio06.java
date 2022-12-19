package com.thiago.cursojava.aula15.tarefa;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if(num1>num2) {
			if(num1==num3)
				System.out.println("O primeiro e o terceiro são iguais e maiores que o segundo");
			else if(num1 > num3)
				System.out.println("O primeiro é maior");
		}
		else if(num2 > num3) {
			if(num2==num1)
				System.out.println("O segundo e o primeiro são iguais e maiores que o terceiro");
			else if(num2>num1)
				System.out.println("O segundo é maior");
		}
		else if(num3 > num1) {
			
			if(num3==num2)
				System.out.println("O segundo e o terceiro são iguais e maiores que o primeiro");
			else if(num3>num2)
				System.out.println("O terceiro é maior");
		}
		else
			System.out.println("Os três são iguais");

	}

}
