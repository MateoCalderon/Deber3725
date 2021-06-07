
package Clases;

public class Cuadrilatero {
    public static int area(int L){
      int res=L*L;
      return res;
    }
    public static int perimetro(int l){
        int res2=4*l;
        return res2;
    } 
    public static void main(String[] args){
        int L=2;
        int resul = area(L);
        System.out.println("El Area del cuadrado es:  "+resul);
        int l=2;
        int resul2 = perimetro(l);
        System.out.println("El  del cuadrado es:  "+resul2);
    }
}
