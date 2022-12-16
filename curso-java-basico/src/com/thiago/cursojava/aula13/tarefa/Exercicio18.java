package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet: ");
		double velInternet = scan.nextDouble();

		double tempo = tamArquivo/velInternet;
		
		System.out.println("Tempo de download: " + tempo);
	}

}
