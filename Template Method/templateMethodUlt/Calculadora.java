public abstract class Calculadora { 
   abstract void rval();
   abstract void calc();
   abstract void rs();
   //template method
   public final void calculando(){

     //Recebendo valores
     rval();

     //Calculando valores
     calc();

     //Exibir resultado
     rs();

   }
}