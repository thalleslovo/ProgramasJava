package contabanco;

public class Banco {

    static public void main(String[]args){



        ContaBanco p1 = new ContaBanco();

        p1.setNumconta(152);
        p1.setdono("Thiago");
        p1.setsaldo(2500f);
        p1.setstatus(false);
        p1.settipo("CP");
        p1.Estadoatual();
        p1.getsaldo();






    }
}
