package metodos2;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {

        //tem saldo na conta
        if (saldo > quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }
    void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }
    void consultaSaldo() {
        System.out.println("O saldo da conta " + numero + " é de " + saldo);
    }
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
