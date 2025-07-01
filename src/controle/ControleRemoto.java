package controle;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean trocando;

    // Métodos Especiais
    public  ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.trocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTrocando() {
        return trocando;
    }

    public void setTrocando(boolean trocando) {
        this.trocando = trocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    // Métodos Abstrados

}
