package metodos;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligada(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligada();
        } else {
            ligar();
        }
    }

}
