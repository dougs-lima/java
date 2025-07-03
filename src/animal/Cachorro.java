package animal;

public class Cachorro implements Animal{
    @Override
    public void fazerSom() {
        System.out.println("Au, Au!");
    }

    @Override
    public void movimentar() {
        System.out.println("Correndo como um louco");
    }
}
