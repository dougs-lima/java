package banco2;

public class ContaBanco {
    private String numConta;
    private String cliente;
    private int tipoConta;
    private double saldo;
    private boolean status;

    // Métodos Personalizados

    public void abrirConta(int t) {
        this.setTipoConta(t);
        if (1 == t) {
            System.out.println("Parabéns você acaba de abrir sua conta corrente.");
        }

    }

    // Métodos Principais
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCliente() {
        return cliente;
    }
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    public int getTipoConta() {
        return tipoConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
}
