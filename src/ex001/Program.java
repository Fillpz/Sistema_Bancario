package ex001;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("\nDeseja fazer depósito inicial? S/N ");
        double depositoInicial = 0;
        char opcao = sc.next().charAt(0);
        while (opcao != 's' && opcao != 'n' && opcao != 'S' && opcao != 'N') {
            System.out.println("Opcão inválida, tente novamente: ");
            opcao = sc.next().charAt(0);
        }
        if (opcao == 'S' || opcao == 's') {
            System.out.print("Insira o valor do depósito inicial: ");
            depositoInicial = sc.nextDouble();
        }

        Banco conta = new Banco(numeroConta, nomeTitular, depositoInicial);

        System.out.println(conta);

        System.out.printf("Digite um valor para depósito: ");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println(conta);

        System.out.printf("Digite um valor para saque: ");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println(conta);

        sc.close();
    }
}