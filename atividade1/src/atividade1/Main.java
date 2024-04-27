package atividade1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Cliente cliente1 = new Cliente("1", 1000.00f);
		Cliente cliente2 = new Cliente("2", 1000.00f);
		Cliente cliente3 = new Cliente("3", 1000.00f);
		Cliente cliente4 = new Cliente("4", 1000.00f);
		Cliente cliente5 = new Cliente("5", 1000.00f);
		
		System.out.println("Cliente1 tem R$" + cliente1.getSaldo());
		System.out.println("Cliente2 tem R$" + cliente2.getSaldo());
		System.out.println("Cliente3 tem R$" + cliente3.getSaldo());
		System.out.println("Cliente4 tem R$" + cliente4.getSaldo());
		System.out.println("Cliente5 tem R$" + cliente5.getSaldo());
	}
}