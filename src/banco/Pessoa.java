package banco;

import java.util.Scanner;

public class Pessoa {
    Scanner scan = new Scanner(System.in);

    private String cliente;
    private int tipoConta = 0;
    private int numConta;
    private int senhaConta = 0;
    private double saldo;
    private boolean status;

    /*public Pessoa(int tipoConta,int senhaConta){
        this.tipoConta = 0;
        this.senhaConta = 0;
    }*/

    public void setAbrirConta() {
        System.out.println("Digite o seu nome: ");
        this.cliente = scan.nextLine();
        while (tipoConta != 1 && tipoConta != 2) {
            System.out.println("TIPO DE CONTA:");
            System.out.println("\n[1] - Conta Corrente;");
            System.out.println("[2] - Conta poupança");
            this.tipoConta = scan.nextInt();
            if ( tipoConta != 1 && tipoConta != 2) {
                System.out.println("Opção inválida, tente novamente!\n");
            }
        }
        while (senhaConta < 1 || senhaConta > 999999) {
            System.out.println("Digite uma senha de até 6 dígitos: ");
            this.senhaConta = scan.nextInt();
            if (senhaConta < 1 || senhaConta > 999999) {
                System.out.println("Senha inválida, tente novamente.\n");
            }
        }
        System.out.println("Conta criada com sucesso.");

    }

}
