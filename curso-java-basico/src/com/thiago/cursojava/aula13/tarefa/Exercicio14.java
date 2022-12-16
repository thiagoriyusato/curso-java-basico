package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o peso do peixe: ");
		double peso = scan.nextDouble();
		double excesso = 0;
		double multa = 0;
		
		if(peso>50) {
			excesso = peso-50;
			multa = excesso*4;
			System.out.println("O preço da multa será de: R$" + multa);
		}
		else {
			System.out.println("O preço da multa será de: R$" + multa);
		}
	}

}
