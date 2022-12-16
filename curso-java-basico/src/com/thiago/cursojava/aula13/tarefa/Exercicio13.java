package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo: 1 para Homens 2 para Mulheres");
		byte sexo = scan.nextByte();
		System.out.println("Digite sua altura");
		double altura = scan.nextDouble();
		double pesoideal = 0;

		System.out.println("Digite seu peso: ");
		double peso = scan.nextDouble();
		
		if(sexo == 1) {
			pesoideal = (72.7*altura)-58;
			if(peso == pesoideal) 
				System.out.println("Você está dentro do peso ideal!");
			else if(peso < pesoideal)
				System.out.println("Você está abaixo do peso ideal!");
			else
				System.out.println("Você está acima do peso ideal!");
		}
		else {
			pesoideal = (62.1*altura)-44.7;
			if(peso == pesoideal) 
				System.out.println("Você está dentro do peso ideal!");
			else if(peso < pesoideal)
				System.out.println("Você está abaixo do peso ideal!");
			else
				System.out.println("Você está acima do peso ideal!");
		}
	}
}

