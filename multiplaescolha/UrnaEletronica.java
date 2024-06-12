package multiplaescolha;

import java.util.Scanner;

public class UrnaEletronica {
    static public void main(String[] args) {

            Scanner t = new Scanner(System.in);
            System.out.print("\n Bem Vindo a Urna Eletronica !\n ");
            System.out.print("\n Digite o seu nome : ");
            String nome = t.next();
            System.out.printf("\n Seja Bem Vindo %s !\n ", nome);
            System.out.print("\n Insira um Numero para garantir o seu voto \n 1-Lula  \n 2-Bolsonaro \n 3-Dória \n 4-Pablo Marçal \n 5-Michel Temer\n");
            System.out.print("\n Numero: ");
            int Voto = t.nextInt();
            String var10000;
            switch (Voto) {
                case 1 -> var10000 = "Lula";
                case 2 -> var10000 = "Jair Bolsonaro";
                case 3 -> var10000 = "Dória";
                case 4 -> var10000 = "Pablo Marçal";
                case 5 -> var10000 = "Michel Temer";
                default -> var10000 = "Voto Encerrado";
            }

            String Candidato = var10000;
            System.out.printf("\n Voto Confirmado ! \n %s \n  ", Candidato);


        }
    }