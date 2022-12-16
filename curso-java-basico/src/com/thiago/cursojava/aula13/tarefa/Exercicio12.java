package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura de uma pessoa: ");
		double altura = scan.nextDouble();
		
		double pesoideal = (72.7*altura)-58;
		
		System.out.println("O peso ideal seria de " + pesoideal + " kgs");

	}

}
