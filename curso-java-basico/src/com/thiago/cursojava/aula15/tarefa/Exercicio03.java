package com.thiago.cursojava.aula15.tarefa;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo F - feminino M - masculino");
		String sexo = scan.next();
		
		switch(sexo) {
		case "F": System.out.println("Feminino"); break;
		case "M": System.out.println("Masculino"); break;
		default: System.out.println("Sexo inválido"); break;
		}

	}

}
