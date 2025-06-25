package garrafa;

public class GarrafaTeste {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();
        g1.marca = "nord";
        g1.cor = "Preta";
        g1.ml = 700;
        g1.tamanho = 26.0;

        g1.status();
        g1.destampar();
        g1.beber();
    }
}
