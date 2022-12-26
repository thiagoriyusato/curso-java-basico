package com.thiago.cursojava.aula34;

public class TesteCalculadora {

	static int resultSoma;
	
	public static void main(String[] args) {
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		//calc.soma(10, 10);
		
		resultSoma = MinhaCalculadora.soma(10, 20);
		

	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
