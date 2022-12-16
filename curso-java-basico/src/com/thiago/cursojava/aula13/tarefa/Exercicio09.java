package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		
		double celsius = (5*(fahrenheit-32)/9);
		System.out.println("Temperatura em Celsius: " + celsius);


	}

}
