package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = (celsius*9/5)+32;
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);


	}

}
