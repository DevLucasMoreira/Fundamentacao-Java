package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta ();
		Conta contaPoupanca = new Conta ();
		Conta contaInvestimento = new Conta ();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Lucas";
		contaCorrente.cliente.idade = 30;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Lucas";
		contaPoupanca.cliente.idade = 30;
		
		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "Lucas";
		contaInvestimento.cliente.idade = 30;
		
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
	}

}
