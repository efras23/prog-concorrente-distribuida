package atividade1;

public class Conta {
	private String num = "";
	private float saldo = 0.0f;
	
	Conta(String num, float valor) {
		this.num = num;
		this.saldo = valor;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(String num, float saldo) {
		this.num = num;
		this.saldo = saldo;
	}
}
