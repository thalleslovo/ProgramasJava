package contabanco;

public class ContaBanco {

    public int Numconta;
    protected String tipo;
    private String Dono;
    private float saldo;
    private boolean status;

    public void Estadoatual(){

        System.out.println("Conta: " + this.getnumconta());
        System.out.println("Tipo: " + this.gettipo());
        System.out.println("Dono: "  + this.getdono());
        System.out.println("Saldo: " + this.getsaldo());


    }

    public ContaBanco() {


        this.saldo = 0;
        this.status = false;

    }


    public void setNumconta(int n) {
        this.Numconta = n;
    }

    public int getnumconta(){
        return this.Numconta;
    }

    public void settipo(String t)  {
        this.tipo = t;
    }

    public String gettipo(){
        return this.tipo;
    }
    public void setdono(String d) {
        this.Dono = d;
    }

    public String getdono () {
        return this.Dono;
    }
    public void setsaldo (float s) {
        this.saldo = s;
    }
    public float getsaldo (){
        return this.saldo;

    }
    public void setstatus (boolean st) {
        this.status = st;
    }
    public boolean getstatus (){
        return this.status;
    }

    public void Abrirconta(String t){

        this.settipo(t);
        this.setstatus(true);

        if("CC".equals(t)){
            this.setsaldo(50f);
            System.out.println("\n Conta Corrente aberta com sucesso!  \n");
        }else{
            if( "CP".equals(t)) this.setsaldo(150f);
            System.out.println("\n Conta poupança aberta com sucesso!\n");


        }


    }

    public void fecharconta(){

        if(this.getsaldo() >0){
            System.out.println("Conta com Dinheiro");
        }else{
            if(this.getsaldo()<0){
                System.out.println(" Conta no Negativo");
            }else{
                this.setstatus(false);
                System.out.println("Conta Fechada");
            }
        }



    }
    public void Depositar(float V){

        if(this.getstatus()){
            this.setsaldo(this.getsaldo()+V);
            System.out.println("Depósito realizado na conta de " + this.Dono);
        }else{
            System.out.println("Impossivel Depositar");

        }


    }
    public void Sacar(float V){

        if (this.getstatus()){
            if (this.getsaldo()>= V){
                this.setsaldo(this.getsaldo() - V);
                System.out.println("Saque realizado na conta de " + this.getdono());

            }else{
                System.out.println("Saldo insuficiente para saque");


            }

        }else{
            System.out.println(" Conta Fechada! ");
        }
    }


    public void Pagarmensal(float V){


        if("CC".equals(this.gettipo())){
            V = 12f;
        }else{
            if("CP".equals(this.gettipo())){
                V = 20f;
            }
            if(this.getstatus()){
                if(this.getsaldo() > V){
                    this.setsaldo(this.getsaldo()- V);

                }else{
                    System.out.println(" Pagamento Realizado " + this.getdono());
                }
            }else{
                System.out.println(" Conta Fechada" );
            }

        }




    }

}



