package atividade1;

public class Loja {
	private Conta conta = new Conta();
	private String func1 = "";
	private String func2 = "";
	
	Loja(String num, float saldo){
		this.conta.setNumConta(num);
		this.conta.setSaldo(saldo);
	}
	
	//getters
	public String getNumConta() {
		return conta.getNumConta();
	}
	
	public float getSaldo() {
		return conta.getSaldo();
	}
	
	public String getFunc1() {
		return this.func1;
	}
	
	public String getFunc2() {
		return this.func2;
	}
	
	//setters
	public void setFunc1(String func1) {
		this.func1 = func1;
	}
	
	public void setFunc2(String func2) {
		this.func2 = func2;
	}
}
