/***
 * Analice el siguiente código
 * Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario 
 * ingrese por teclado una letra que coincida con la primera letra de los
 * "nombres" contenidos en del arreglo estudiantes. Debe usar un ciclo 
 * repetitivo para recorrer el arreglo estudiantes, y no quemar de forma 
 * constante dichas iniciales, imagine que estudiantes podría contener millón 
 * de nombres, por lo que fijar iniciales, es ineficiente.Autor :Evelin
 */
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra:");
            inicial = tcl.nextLine();

            for (int i = 0; i < estudiantes.length; i++) {
                if (estudiantes[i].substring(0, 1).equalsIgnoreCase(inicial)) {
                    System.out.println("La letra coincide con: " + estudiantes[i]);
                    bandera = false; 
                    break;
                }
            }

            if (bandera) {
                System.out.println("La letra no coincide con ningún nombre, intente de nuevo");
            }
        }

        System.out.println("Programa finalizado");
    }
}
/**
 * Ingrese una letra:
w
La letra no coincide con ning�n nombre, intente de nuevo
Ingrese una letra:
t
La letra coincide con: Teresa
Programa finalizado
 */

