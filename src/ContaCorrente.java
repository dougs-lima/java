class Conta {
    String cliente;
    int conta;
    int agencia;
    int status; //1 conta normal, 2 conta especial
    double saldo;
    double limiteCredito;

}

public class ContaCorrente {
    public static void main(String[] args) {
        Conta Corrente = new Conta();
        Corrente.cliente = "Gustavo Machado";
        Corrente.conta = 14245;
        Corrente.agencia = 124;
        Corrente.status = 1;
        Corrente.saldo = 4526.15;
        Corrente.limiteCredito = 8500;
    }
}
