package garrafa;

public class Garrafa {
    String marca;
    String cor;
    int ml;
    double tamanho;
    boolean tampado;

    void beber() {
        if (this.tampado == true) {
            System.out.println("Não tem como beber com a garrafa tampada.");
        } else {
            System.out.println("Glu, glu, glu!!!");
        }
    }
    void tampar() {
        this.tampado = true;
    }
    void destampar() {
        this.tampado = false;
    }
    void status() {
        System.out.println("A garrafa " + this.marca);
        System.out.println("Da cor " + this.cor);
        System.out.println("Tem capacidade de " + this.ml + "ml");
        System.out.println("Com o tamanho de " + this.tamanho + "cm");
    }
}
