package animal;

public class Gato implements Animal{

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }

    @Override
    public void movimentar() {
        System.out.println("Lentamente");
    }
}
