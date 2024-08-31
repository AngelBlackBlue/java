//La clase abstracta no se puede instanciar
public abstract class CriaturasMarinas {

   //Atributo
   String nombre;

   //Contructor
   public CriaturasMarinas(String nombre){
    this.nombre = nombre;
   }
   
   // esto obliga a sobre escribir en las clases que hereden de criaturas marinas
   abstract void nadar(); 


}
