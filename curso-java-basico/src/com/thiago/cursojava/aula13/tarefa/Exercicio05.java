package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros: ");
		double valor = scan.nextDouble();
		
		double centimetros = valor * 100;
		
		System.out.println("O valor em centímetros é " + centimetros);

	}
	
}
