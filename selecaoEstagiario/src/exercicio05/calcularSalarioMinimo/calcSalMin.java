package exercicio05.calcularSalarioMinimo;

public class calcSalMin {
    private double salMin;
    private double salUsuario;

    public calcSalMin(double salUsuario) {
        this.salMin = 1320;
        this.salUsuario = salUsuario;
    }

    public calcSalMin() {
    }

    public double getSalMin() {
        return salMin;
    }

    public double getSalUsuario() {
        return salUsuario;
    }

    public void setSalUsuario(double salUsuario) {
        this.salUsuario = salUsuario;
    }

    public double qntSalMin(){
        double qtdSalariosMin =  getSalUsuario()/getSalMin();
        return  qtdSalariosMin;
    }

}
