package estruturasimples;

import java.util.Scanner;

public class AprovacaoCNH {

    static public void main(String[] args){

        Scanner t = new Scanner(System.in);
        System.out.println("\n Pré Aprovação de CNH ");
        System.out.print("\n Qual o seu nome : ");
        String nome = t.next();
        System.out.printf("\n Seja Bem Vindo %s!\n  \n A Pré Aprovação de CNH \n ",nome);
        System.out.print(" \n Qual o seu ano de Nascimento: ");
        int ano = t.nextInt();
        int s = 2024 - ano;
        System.out.printf("\n Você tem %d anos de Idade \n ",s);
        if (s >= 18){
            System.out.printf("\n O Candidato %s foi Pré Aprovado \n ",nome);
        }

// O Candidato só vai conseguir ser Pré Aprovado caso seja maior de Idade.














    }
}
