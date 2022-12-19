package com.thiago.cursojava.aula17.tarefa;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUsuario;
		String senha;
		
		do {
			System.out.println("Digite o nome do usuário: ");
			nomeUsuario = scan.next();
			
			System.out.println("Digite a senha:");
			senha = scan.next();
			
			if(nomeUsuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha = Usuario! Digite novamente!");
			}
			else {
				infoValidas = true;
				System.out.println("Senha e Usuaro válidos!");
			}
		}while(!infoValidas);

	}

}
