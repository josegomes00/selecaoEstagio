package exercicio05.main;

import exercicio05.calcularSalarioMinimo.calcSalMin;

public class Main {
    public static void main(String[] args) {
        calcSalMin c = new calcSalMin(3000);
        System.out.println(c.qntSalMin());
    }
}
