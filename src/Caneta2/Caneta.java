package Caneta2;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(float ponta, String modelo, String cor) {
        this.ponta = ponta;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public void status() {
        System.out.println("TIPO CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta " + this.getPonta());
    }
}
