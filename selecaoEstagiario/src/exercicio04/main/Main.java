package exercicio04.main;

import exercicio04.calculoPecas.calculoPecas;

public class Main {
    public static void main(String[] args) {
        calculoPecas c = new calculoPecas(10,1212,120.00,2,1213,100,5);
        System.out.printf("R$%.2f", c.calcularTotal());
    }
}
