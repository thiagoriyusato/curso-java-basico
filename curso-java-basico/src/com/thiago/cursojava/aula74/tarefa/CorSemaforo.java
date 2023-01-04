package com.thiago.cursojava.aula74.tarefa;

public enum CorSemaforo {
	VERDE(1000), VERMELHO(3000), AMARELO(300);
	
	private int tempoEspera;
	
	CorSemaforo(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	
}
