package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int soma = num1+num2;
		System.out.println("A soma dos dois número é " + soma);
		

	}


}
