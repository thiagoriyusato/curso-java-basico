package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado de um quadrado: ");
		double area = Math.pow(scan.nextDouble(), 2);
		
		
		System.out.println("O dobro da área do quadrado é "+ area*2);
	}
}
