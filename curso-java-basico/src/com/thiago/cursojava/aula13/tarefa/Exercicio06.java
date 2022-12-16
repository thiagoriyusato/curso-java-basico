package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio da circunferência: ");
		double raio = scan.nextDouble();
		double raioquadrado = Math.pow(raio, 2);
		
		double area = raioquadrado * 3.14;
		System.out.println("A área da circunferência é " + area);

	}

}
