package caixaeletronico;


import java.util.Scanner;

public class CaixaEletronica {
    static public void main(String[] args){

        Scanner t  = new Scanner(System.in);

        System.out.println("\n Bem Vindo ao Caixa Eletronico! \n ");
        System.out.print("\n Qual o seu nome: ");
        String nome = t.next();
        System.out.printf("\n Olá %s ! \n ",nome);
        System.out.print("\n Digite a sua senha :");
        int senha = t.nextInt();
        System.out.print("\n Digite o valor do Saque R$: ");
        float saque = t.nextFloat();
        System.out.printf("\n Deseja sacar %.2f [S/N]",saque);
        String resp = t.next();

            if ("S".equals(resp)){
                System.out.println("\n Saque Realizado Com Sucesso !");

                System.out.printf("\n Você Sacou %.2f \n ",saque);
                float saldo = 2000f;
                float retirada = saldo - saque;
                System.out.printf("\n Seu Saldo é de R$%.2f \n ",retirada);
            } else if ("N".equals(resp)) {

                System.out.println("Transação Cancelada.....");


            }

            }


    }



