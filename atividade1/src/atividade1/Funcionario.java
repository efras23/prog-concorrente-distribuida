package atividade1;

public class Funcionario extends Thread {
	private String nome = "";
	private Conta contaSalario = new Conta();
	private Conta contaInvestimento = new Conta();
	
	Funcionario(String nome, String numContaSalario, String numContaInvestimento, float saldoInicial){
		this.nome = nome;
		this.contaSalario.setNumConta(numContaSalario);
		this.contaInvestimento.setNumConta(numContaInvestimento);
		this.contaSalario.setSaldo(saldoInicial);
	}
	
	public String getNome() {
		return this.nome;
	}

	public float getSalario(){
		return this.contaSalario.getSaldo();
	}
	
	public float getInvestimento() {
		return this.contaInvestimento.getSaldo();
	}
	
	public void run(){

	}
}
