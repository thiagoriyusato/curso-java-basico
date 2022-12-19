package com.thiago.cursojava.aula15.tarefa;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		double num1 = scan.nextDouble();
		
		if(num1%2==0)
			System.out.println("Número é par");
		else if(num1%2!=0)
			System.out.println("Número é impar");
		else
			System.out.println("Não é um número aceito");

	}

}
