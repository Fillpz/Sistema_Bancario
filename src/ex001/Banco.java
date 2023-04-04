package ex001;

public class Banco {

    // Atributos
    private int numero;
    private String nome;
    private double saldo;

    // Construtor
    public Banco(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        if(depositoInicial != 0) {
            this.saldo = depositoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // Outros métodos
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("Valor insuficiente para saque!");
        } else {
            saldo -= valor + 5;
        }
    }

    @Override
    public String toString() {
        return "\nDados da conta: \nNumero: " + numero + " Titular: " + nome + " Saldo: " + String.format("%.2f", saldo);
    }
}
