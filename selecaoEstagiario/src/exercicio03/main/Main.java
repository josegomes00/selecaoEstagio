package exercicio03.main;

import exercicio03.saldo.ReajusteSaldo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReajusteSaldo r = new ReajusteSaldo();
        double saldo;

        System.out.println("Digite o Saldo para Reajuste de 1%: ");
        saldo =  scan.nextDouble();
        double novoSaldo = r.reajusteSaldo(saldo);

        System.out.println("O Saldo com reajuste de 1% é de R$ " + novoSaldo);

    }
}
