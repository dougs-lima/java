package banco;

import java.util.Scanner;

public class Pessoa {
    Scanner scan = new Scanner(System.in);

    private String cliente;
    private int tipoConta;
    private int senhaConta;
    private double saldo;
    private boolean status;
    private String numContaFechar;
    private int senhaContaFechar;
    private Conta nConta = new Conta();

    public Pessoa(int tipoConta,int senhaConta){
        this.tipoConta = tipoConta;
        this.senhaConta = senhaConta;
    }

    public void setAbrirConta() {
        System.out.println("Digite o seu nome: ");
        this.cliente = scan.nextLine();
        while (tipoConta != 1 && tipoConta != 2) {
            System.out.println("TIPO DE CONTA:");
            System.out.println("\n[1] - Conta Corrente");
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
        nConta.setCriacaoConta();
        this.status = true;
        System.out.println("Conta criada com sucesso.");

    }
    public void setFecharConta() {
        System.out.println("Qual o número da sua conta? ");
        this.numContaFechar = scan.nextLine();
        if (numContaFechar.equals(getNumeroConta())) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Digite a senha: ");
                this.senhaContaFechar = scan.nextInt();
                if (senhaContaFechar == senhaConta) {
                    this.status = false;
                    System.out.println("Sua conta foi encerrada.");
                    break;
                }
                System.out.println("Você errou a senha, tente novamente.");
            }
            if (senhaContaFechar != senhaConta) {
                System.out.println("Você excedeu o numero de vezes, tenha novamente mais tarde.");
            }
        } else {
            System.out.println("Conta não existente.");
        }
    }
    //public
}
