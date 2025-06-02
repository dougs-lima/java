package metodologia;

public class Carro {

    // Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Metodo sem retorno
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    }

    // Metodo com retorno
    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }

    // Metodo com parâmetro
    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }

}

