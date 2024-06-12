package Repeticaotestenofinal;

import java.util.Scanner;

public class TestenoFinal {

    static public void main(String[] args) {


        Scanner t = new Scanner(System.in);
        System.out.println("\n Bem Vindo a Somadora JAVA!\n ");

        System.out.print("\n Qual é o seu nome : ");
        String nome = t.next();
        System.out.printf(" \n Olá %s  \n ", nome);

        int n1;
        int s = 0;
        String r;


        do {
            System.out.println("\n Digite um numero: ");
            n1 = t.nextInt();
            s += n1;
            System.out.println("\n Deseja Continuar ? \n [S/N]:");
            r = t.next();


        } while (r.equals("S"));

        if (r.equals("N")) {
            System.out.println("O Resultado é " + s);


        }
    }
}
