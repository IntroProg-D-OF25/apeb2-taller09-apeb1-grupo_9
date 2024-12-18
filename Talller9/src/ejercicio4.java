/**
 *Dado el arreglo; determinar cuantos elementos están arriba de la media
 * aritmética y cuantos están por debajo de la medía aritmética.Autor:Evelin
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int mediaA;
        int suma = 0;
        int abajo = 0;
        int arriba = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        mediaA = suma/arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mediaA) {
                arriba = arriba+1;
            }else if(arreglo[i]< mediaA){
                abajo = abajo+1;
            }
        }
        System.out.println("Media: "+mediaA);
        System.out.println("Esta es la cantidad de elementos que estan arriba de la media: "+arriba);
        System.out.println("Esta es la cantidad de elementos que estan abajo de la media:  "+abajo);
    }
}
/***
 * Media: 9
Esta es la cantidad de elementos que estan arriba de la media: 8
Esta es la cantidad de elementos que estan abajo de la media:  4
 */
