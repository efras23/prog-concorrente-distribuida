package atividade1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Cliente cliente1 = new Cliente("c_1", 1000.00f);
		Cliente cliente2 = new Cliente("c_2", 1000.00f);
		Cliente cliente3 = new Cliente("c_3", 1000.00f);
		Cliente cliente4 = new Cliente("c_4", 1000.00f);
		Cliente cliente5 = new Cliente("c_5", 1000.00f);
		Funcionario func1 = new Funcionario("Fafa", "f_s_1", "f_i_1", 0.0f);
		Funcionario func2 = new Funcionario("Fefe", "f_s_2", "f_i_2", 0.0f);
		Funcionario func3 = new Funcionario("Fifi", "f_s_3", "f_i_3", 0.0f);
		Funcionario func4 = new Funcionario("Fofo", "f_s_4", "f_i_4", 0.0f);
		Loja loja1 = new Loja("l_1", 0.0f);
		Loja loja2 = new Loja("l_2", 0.0f);
		
		loja1.setFunc1(func1.getNome());
		loja1.setFunc2(func2.getNome());
		loja2.setFunc1(func3.getNome());
		loja2.setFunc2(func4.getNome());
		
		System.out.println("Cliente1 tem R$" + cliente1.getSaldo());
		System.out.println("Cliente2 tem R$" + cliente2.getSaldo());
		System.out.println("Cliente3 tem R$" + cliente3.getSaldo());
		System.out.println("Cliente4 tem R$" + cliente4.getSaldo());
		System.out.println("Cliente5 tem R$" + cliente5.getSaldo());
		System.out.println("Conta da Loja 1: " + loja1.getNumConta());
		System.out.println("Conta da Loja 2: " + loja2.getNumConta());
		System.out.println("Funcionário 2 da Loja 1: " + loja1.getFunc2());
	}
}