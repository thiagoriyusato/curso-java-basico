package com.thiago.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//Convenção Java
		int idade = 20;
		String nome = "Thiago";
		String nomeDoMeuCachorro =  "Leona";
		String ano2014 = "2014";
		
		
		//Aceito, mas não é utilizado
		int _idade;
		int $idade;
		
		
		//Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		//Má prática
		int a = 10;
		String b = "Thiago";

	}

}
