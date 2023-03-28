package exercicio03.saldo;

public class ReajusteSaldo {
    public double reajusteSaldo(double saldo){
        saldo += (saldo * 0.01);
        return saldo;
    }
}