package com.thiago.cursojava.aula15.tarefa;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = scan.next().toLowerCase();
		
		switch(letra){
		case "a": 
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("Vogal"); break;
		default: System.out.println("Consoante"); break;
		}
	}

}
