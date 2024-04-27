package atividade1;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello");
		Cliente cliente1 = new Cliente("1", 1000.00f);
		Cliente cliente2 = new Cliente("2", 1000.00f);
		Cliente cliente3 = new Cliente("3", 1000.00f);
		Cliente cliente4 = new Cliente("4", 1000.00f);
		Cliente cliente5 = new Cliente("5", 1000.00f);
		
		System.out.println("Cliente1 tem R$" + cliente1.getSaldo());
	}
}
