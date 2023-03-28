package exercicio04.calculoPecas;

public class calculoPecas {

    private double IPI;

    private int codigo01;
    private double valor01;
    private int qtd01;

    private int codigo02;
    private double valor02;
    private int qtd02;

    public calculoPecas(int IPI, int codigo01, double valor01, int qtd01, int codigo02, double valor02, int qtd02) {
        this.IPI = IPI;
        this.codigo01 = codigo01;
        this.valor01 = valor01;
        this.qtd01 = qtd01;
        this.codigo02 = codigo02;
        this.valor02 = valor02;
        this.qtd02 = qtd02;
    }

    public calculoPecas() {
    }

    public double getIPI() {
        return IPI;
    }

    public void setIPI(int IPI) {
        this.IPI = IPI;
    }

    public int getCodigo01() {
        return codigo01;
    }

    public void setCodigo01(int codigo01) {
        this.codigo01 = codigo01;
    }

    public double getValor01() {
        return valor01;
    }

    public void setValor01(double valor01) {
        this.valor01 = valor01;
    }

    public int getQtd01() {
        return qtd01;
    }

    public void setQtd01(int qtd01) {
        this.qtd01 = qtd01;
    }

    public int getCodigo02() {
        return codigo02;
    }

    public void setCodigo02(int codigo02) {
        this.codigo02 = codigo02;
    }

    public double getValor02() {
        return valor02;
    }

    public void setValor02(double valor02) {
        this.valor02 = valor02;
    }

    public int getQtd02() {
        return qtd02;
    }

    public void setQtd02(int qtd02) {
        this.qtd02 = qtd02;
    }

    public double calcularTotal(){
        double total = (getValor01() * getQtd01() + getValor02() * getQtd02()) * (getIPI()/100 + 1);
        return total;
    }
}
