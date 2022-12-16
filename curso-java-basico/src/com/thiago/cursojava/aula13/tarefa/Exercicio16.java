package com.thiago.cursojava.aula13.tarefa;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros quadrados da área a ser pintada: ");
		double area = scan.nextDouble();
		double litrotinta = area/3;
		double c = 1;
		if(litrotinta >= 18){
			for(c = 1; litrotinta >=18 ; litrotinta = litrotinta -18) {
				c++;
			}
			System.out.println("A quantidade de latas será de " + c + "e o preço total será de R$" + c*80 );
		}
		else
			System.out.println("A quantidade de latas será de " + c + " e o preço total será de R$80.00.");

	}

}
