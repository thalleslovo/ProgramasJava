package vetores;

import java.util.Arrays;

public class BuscaVetor {

    static public void main(String[] args){

        int[] vet = {3,  6, 1, 9, 4 , 2};

        for (int v : vet){
            System.out.print(v + " ");
        }

        System.out.println(" ");
       int p = Arrays.binarySearch(vet,1);
        System.out.println("Encontrei o Valor na Posiçao " + p) ;

    }

}

