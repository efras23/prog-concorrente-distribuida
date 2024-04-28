package atividade1;

class Cliente extends Thread {
    private Banco banco;
    private Conta contaCliente;
    private String nome;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.contaCliente = new Conta(1000);
    }

    public void run() {
        while (contaCliente.getSaldo() > 0) {
            double valorCompra = Math.random() < 0.5 ? 100 : 200;
            Conta contaLoja = Math.random() < 0.5 ? banco.getContaLoja1() : banco.getContaLoja2();
            banco.transferir(valorCompra, contaCliente, contaLoja);
            System.out.println(nome + " comprou na loja, saldo restante: " + contaCliente.getSaldo());
        }
    }
}