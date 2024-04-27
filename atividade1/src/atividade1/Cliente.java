package atividade1;

public class Cliente extends Thread {
	private Conta conta;
	
	Cliente(String num, float saldo){
		conta.setSaldo(num, saldo);
	}
	
	public float getSaldo(){
		return conta.getSaldo();
	}
	
	public void comprar() {
		
	}
	
	public void run(){
		
	}
}
