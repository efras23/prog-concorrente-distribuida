package atividade1;

public class Cliente extends Thread {
	private Conta conta = new Conta();
	
	Cliente(String num, float saldo){
		this.conta.setSaldo(num, saldo);
	}
	
	public float getSaldo(){
		return this.conta.getSaldo();
	}
	
	public void comprar() {
		
	}
	
	public void run(){
		
	}
}
