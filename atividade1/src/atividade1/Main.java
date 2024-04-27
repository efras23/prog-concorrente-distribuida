package atividade1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Cliente cliente1 = new Cliente("c_1", 1000.00f);
		Cliente cliente2 = new Cliente("c_2", 1000.00f);
		Cliente cliente3 = new Cliente("c_3", 1000.00f);
		Cliente cliente4 = new Cliente("c_4", 1000.00f);
		Cliente cliente5 = new Cliente("c_5", 1000.00f);
		Loja loja1 = new Loja("l_1", 0.0f);
		Loja loja2 = new Loja("l_2", 0.0f);
		
		System.out.println("Cliente1 tem R$" + cliente1.getSaldo());
		System.out.println("Cliente2 tem R$" + cliente2.getSaldo());
		System.out.println("Cliente3 tem R$" + cliente3.getSaldo());
		System.out.println("Cliente4 tem R$" + cliente4.getSaldo());
		System.out.println("Cliente5 tem R$" + cliente5.getSaldo());
		System.out.println("Conta da Loja 1: " + loja1.getNumConta());
		System.out.println("Conta da Loja 2: " + loja2.getNumConta());
	}
}