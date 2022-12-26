package com.thiago.cursojava.aula29;

import com.thiago.cursojava.aula29.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é " + autonomia);
		System.out.println("A autonomia do carro é " + van.obterAutonomia());
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.consumoCombustivel);
		System.out.println(van2.capCombustivel);
		
		Carro2 carro2 = new Carro2("null", "null", 0, 0, 0);
	}
}
