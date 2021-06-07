
package Clases;

public class Prueba {
    
  public static void main(String[] args){
      Cubo ob1= new Cubo();
      ob1.Ancho=3;
      ob1.Altura=2;
      ob1.Profundo=6;
      ob1.resultado();
      int resul=ob1.resultado();
      System.out.println("El Volumen es: "+resul);
      
}
}
