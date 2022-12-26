package com.thiago.cursojava.aula43.tarefa;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		String s = "ContaBancaria[";
		s += "Numero da conta: " + nomeCliente;
		s += "Nome do cliente: " + nomeCliente;
		s += "Saldo da conta: " + saldo;
		s += "]";
		return s;
 	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if((saldo-valor)>=0) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
}
