/***
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
 * El arreglo almacena el número de elementos que el usuario lo disponga.
 * Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.

Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe 
* permitir ingresar ese número elementos.

Considerar las siguientes excepciones, no se contabilizan dentro del número 
* de elementos, marcas que empiecen con las letras A, C, T.Autor valeria 
 */
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;

        System.out.print("¿Cuantas marcas desea ingresar?: ");
        numero = tcl.nextInt();

        String[] marcas = new String[numero];
        int i = 0;

        while (i < numero) {
            System.out.print("Ingrese la marca " + (i + 1) + ": ");
            String marca = tcl.next();

            String primeraLetra = marca.substring(0, 1);
            if (primeraLetra.equals("A") || primeraLetra.equals("C") || primeraLetra.equals("T") ||
                primeraLetra.equals("a") || primeraLetra.equals("c") || primeraLetra.equals("t")) {
                System.out.println("La marca '" + marca + "' no es valida, intente otra vez");
            } else {
                marcas[i] = marca;
                i++;
            }
        }

        System.out.println("\nMarcas validas ingresadas:");
        for (int j = 0; j < numero; j++) {
            System.out.println((j + 1) + ". " + marcas[j]);
        }

       
    }
}
/***
 * �Cuantas marcas desea ingresar?: 3
Ingrese la marca 1: convers
La marca 'convers' no es valida, intente otra vez
Ingrese la marca 1: gucci
Ingrese la marca 2: praga
Ingrese la marca 3: adidas
La marca 'adidas' no es valida, intente otra vez
Ingrese la marca 3: nike

Marcas validas ingresadas:
1. gucci
2. praga
3. nike
 */
