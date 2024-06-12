package polimorfismo;

public class Pessoa {

   private String nome;
   private int idade;
   private String cargo;
   private int experiencia;

   public void setNome(String nome){
       this.nome = nome;

   }
   public String getNome(){
     return this.nome;

   }

   public void setIdade(int idade){
       this.idade = idade;
   }
   public int getIdade(){

       return this.idade;

   }
   public void setCargo(String cargo){

       this.cargo = cargo;
   }
   public String getCargo(){

       return this.cargo;
   }

   public void setExperiencia(int experiencia){
       this.experiencia = experiencia;
   }
   public int getExperiencia(){
       return this.experiencia;
   }

   public void execucao(){
   }









   public void status(){

       System.out.println(this.getNome());
       System.out.println(this.getIdade());
       System.out.println(this.getCargo());
       System.out.println(this.getExperiencia() + "anos");
   }
















}





