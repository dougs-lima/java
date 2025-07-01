package banco;

public class Conta {
    private static int proximoNumeroConta = 1;
    private String numeroConta;
    private int senha;
    private boolean status;

    /*public Conta(String numConta) {
        this.numeroConta = "123";
    }*/


    public void setCriacaoConta() {
        this.numeroConta = String.format("%04d", proximoNumeroConta);
        proximoNumeroConta++;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

}
