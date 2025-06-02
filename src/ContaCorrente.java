class Conta {
    String cliente;
    String conta;
    String agencia;
    boolean especial;
    double saldo;
    double limiteCredito;

}

public class ContaCorrente {
    public static void main(String[] args) {
        Conta Corrente = new Conta();
        Corrente.cliente = "Gustavo Machado";
        Corrente.conta = "14245";
        Corrente.agencia = "124";
        Corrente.especial = true;
        Corrente.saldo = 4526.15;
        Corrente.limiteCredito = 8500;

        System.out.println(Corrente.cliente);
        System.out.println(Corrente.conta);
        System.out.println(Corrente.agencia);
        System.out.println(Corrente.especial);
        System.out.println(Corrente.saldo);
        System.out.println(Corrente.limiteCredito);
    }
}
