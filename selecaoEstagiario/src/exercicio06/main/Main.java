package exercicio06.main;

import exercicio06.sucessorAntecessor.sucessorAntecessor;

public class Main {
    public static void main(String[] args) {
        sucessorAntecessor s = new sucessorAntecessor(0);
        System.out.println(s.sucessor());
        System.out.println(s.antecessor());
    }
}
