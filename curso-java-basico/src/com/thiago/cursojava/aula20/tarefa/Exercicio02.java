package com.thiago.cursojava.aula20.tarefa;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		for(int i =0;i<numerosAleatorios.length;i++) {
			for (int j=0; j<numerosAleatorios[i].length;j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = 0;
		int linha5 = 5;
		
		for (int i=0; i<numerosAleatorios[linha5].length;i++) {
			if(numerosAleatorios[linha5][i] > maiorL5);{
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if(numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}

		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);
		
	}

}
