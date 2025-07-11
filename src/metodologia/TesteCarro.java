package metodologia;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        System.out.println();
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println();
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());
        System.out.println();

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        System.out.println("qtdCOmbustivel10 = " + qtdCombustivel10);
        System.out.println("qtdCOmbustivel15 = " + qtdCombustivel15);

    }
}
