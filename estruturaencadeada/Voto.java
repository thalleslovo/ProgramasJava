package estruturaencadeada;

import java.util.Scanner;

public class Voto {

    static public void main (String[] args){

        Scanner t  = new Scanner(System.in);
        System.out.print("\n Digite o seu nome : ");
        String nome = t.next();
        System.out.printf("\n Olá %s , Seja Bem Vindo !\n",nome);
        System.out.print("\n Digite o ano do seu Nascimento: ");
        int nasc = t.nextInt();
        int res = 2024 - nasc;
        System.out.printf("\n Você tem %d anos de Idade\n ",res);
        if (res < 16){
            System.out.println("\n Não Vota \n ");
        }else {
            if (res > 16 && res <=18 || res>70){
                System.out.println("\n O Seu é Voto é Opicional\n");
            }else {
                System.out.println("\n O Seu Voto é Obrigatório\n ");
            }
        }








    }


}
