package atividade1;

public class Conta {
	private String num = "";
	private float saldo = 0.0f;
	
	public String getNumConta() {
		return this.num;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setNumConta(String num) {
		this.num = num;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}