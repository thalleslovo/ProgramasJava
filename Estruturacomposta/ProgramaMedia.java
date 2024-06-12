package Estruturacomposta;

import java.util.Scanner;

public class ProgramaMedia {

 static public void main(String[] args)  {

     Scanner t = new Scanner(System.in);

     System.out.println("\n Seja Bem Vindo ao Leitor de Média ! \n ");

     System.out.print("\n Digite o Nome do Aluno : ");
     String nome = t.next();
     System.out.printf("\n Digite as Notas do %s...  \n" ,nome);


     System.out.print("\n Nota de Português:");
     int n1 = t.nextInt();
     System.out.print("\n Nota de Matemática: ");
     int n2 = t.nextInt();
     System.out.print("\n  Nota de Ciências:");
     int n3 = t.nextInt();
     System.out.print("\n  Nota de Inglês: ");
     int n4 = t.nextInt();
     System.out.print("\n  Nota de Educação Física: ");
     int n5 = t.nextInt();
     System.out.print("\n  Nota de Biologia: ");
     int n6 = t.nextInt();
     System.out.print("\n  nota de Física: ");
     int n7 = t.nextInt();
     System.out.print("\n  nota de Quimica: ");
     int n8 = t.nextInt();
     int s = (n1+n2+n3+n4+n5+n6+n7+n8)/8;
     System.out.printf("\n A Média do %s é %d \n ",nome,s);

     if (s < 7) {
         System.out.println(" \n Aluno  Reprovado !\n  ");

     }else {
         System.out.println("\n Aluno Aprovado !n \n ");
     }



















 }


}
