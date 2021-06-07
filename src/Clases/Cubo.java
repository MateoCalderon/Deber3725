
package Clases;

public class Cubo {
  int Ancho;
  int Altura;
  int Profundo;
  public Cubo(){
      
  }
  public Cubo(int Ancho, int Altura, int Profundo){
      this.Ancho=Ancho;
      this.Altura=Altura;
      this.Profundo=Profundo;
  }
  public int resultado(){
      int res=this.Ancho*this.Altura*this.Profundo;
      return res;
  }
}
