package polimorfismo;

public class Profissao {

    static public void main(String[] args){


        Cabelereiro c1 = new Cabelereiro();


        c1.setNome("Thalles");
        c1.setIdade(21);
        c1.setCargo("Cabelereiro");
        c1.setExperiencia(5);
        c1.status();
        c1.execucao();

        System.out.println("\n ");

        Contabilidade cont = new Contabilidade();

        cont.setNome("Joao");
        cont.setIdade(25);
        cont.setCargo("Contabilidade");
        cont.setExperiencia(3);
        cont.status();
        cont.execucao();

    }

}
