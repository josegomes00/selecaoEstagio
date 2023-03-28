package exercicio01.main;

import exercicio01.anos.CountDiaMesAno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d;
        int m;
        int a;

        Scanner scan = new Scanner(System.in);
        CountDiaMesAno c = new CountDiaMesAno();

        System.out.println("Digite Quantos Anos de Vida Você Tem: ");
        a = scan.nextInt();

        System.out.println("Digite Quantos Meses de Vida Você Tem: ");
        m = scan.nextInt();

        System.out.println("Digite Quantos Dias de Vida Você Tem: ");
        d = scan.nextInt();

        c.setAno(a);
        c.setMes(m);
        c.setDia(d);

        System.out.println("Você tem " + c.returnAllInDays() + " dias de Vida!");
    }
}
