package atividade1;

public class Loja {
	private Conta conta = new Conta();
	
	Loja(String num, float saldo){
		this.conta.setNumConta(num);
		this.conta.setSaldo(saldo);
	}
	
	public String getNumConta() {
		return conta.getNumConta();
	}
	
	public float getSaldo() {
		return conta.getSaldo();
	}
	
}
