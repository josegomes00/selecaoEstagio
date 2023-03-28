package exercicio01.anos;

public class CountDiaMesAno {
    private int ano;
    private int mes;
    private int dia;

    public CountDiaMesAno(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public CountDiaMesAno() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int returnAllInDays(){
        int totalDias = 0;
        totalDias += getDia();
        totalDias += getMes()*30;
        totalDias += getAno()*365;

        return totalDias;
    }
}
