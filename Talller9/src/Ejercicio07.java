/**
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas en función a los promedios obtenidos del ciclo por estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, no ingrese el valor, si se debe autogenerar).

Promedio del ciclo, del paralelo C.
Listado de estudiantes con su nota por encima del promedio.
Listado de estudiantes con su nota por debajo del promedio.
Estudiante con la mejor calificación.
Estudiante con la calificación mas baja.
 *autor valeria
 */
import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {
        String[] estudiantes = {
            "Estudiante1", "Estudiante2", "Estudiante3", "Estudiante4", 
            "Estudiante5","Estudiante6", "Estudiante7", "Estudiante8", 
            "Estudiante9", "Estudiante10", "Estudiante11", "Estudiante12",
            "Estudiante13", "Estudiante14", "Estudiante15", "Estudiante16", 
            "Estudiante17", "Estudiante18", "Estudiante19", "Estudiante20",
            "Estudiante21", "Estudiante22", "Estudiante23", "Estudiante24", 
            "Estudiante25", "Estudiante26", "Estudiante27", "Estudiante28"
        };
        double[] notasEstudiantes = new double[28];
        Random random = new Random();
        
        for (int i = 0; i < notasEstudiantes.length; i++) {
            notasEstudiantes[i] = Math.round((random.nextDouble() * 10) 
                                  * 100.0) / 100.0; 
        }
        double suma = 0;
        for (double nota : notasEstudiantes) {
            suma += nota;
        }
        double promedio = suma / notasEstudiantes.length;
        double mejorNota = notasEstudiantes[0];
        double peorNota = notasEstudiantes[0];
        int indiceMejorNota = 0, indicePeorNota = 0;

        for (int i = 1; i < notasEstudiantes.length; i++) {
            if (notasEstudiantes[i] > mejorNota) {
                mejorNota = notasEstudiantes[i];
                indiceMejorNota = i;
            }
            if (notasEstudiantes[i] < peorNota) {
                peorNota = notasEstudiantes[i];
                indicePeorNota = i;
            }
        }

        System.out.println("Promedio del ciclo, paralelo C: " + promedio);
        System.out.println("\nListado de estudiantes con su nota por encima del"
                            + " promedio: ");
        for (int i = 0; i < notasEstudiantes.length; i++) {
            if (notasEstudiantes[i] > promedio) {
                System.out.println(estudiantes[i] + " = Promedio: " + notasEstudiantes[i]);
            }
        }

        System.out.println("\nListado de estudiantes con su nota por debajo "
                            + "del promedio: ");
        for (int i = 0; i < notasEstudiantes.length; i++) {
            if (notasEstudiantes[i] < promedio) {
                System.out.println(estudiantes[i] + " = Promedio: " + notasEstudiantes[i]);
            }
        }

        System.out.println("\nEstudiante con la mejor calificacion:");
        System.out.println(estudiantes[indiceMejorNota] + " = Calificacion: " + mejorNota);

        System.out.println("\nEstudiante con la calificacion mas baja:");
        System.out.println(estudiantes[indicePeorNota] + " = Calificacion: " + peorNota);
    }
}
/***
 * *
 * Promedio del ciclo, paralelo C: 4.76
 * Listado de estudiantes con su nota por encima del promedio: 
 * Estudiante1 = Promedio: 5.67
 * Estudiante2 = Promedio: 8.01
 * Estudiante4 = Promedio: 8.44
 * Estudiante5 = Promedio: 8.83
 * Estudiante6 = Promedio: 8.81
 * Estudiante8 = Promedio: 6.43
 * Estudiante11 = Promedio: 9.59
 * Estudiante14 = Promedio: 8.6
 * Estudiante15 = Promedio: 7.26
 * Estudiante20 = Promedio: 5.24
 * Estudiante25 = Promedio: 7.1
 * Estudiante27 = Promedio: 9.25
 * Estudiante28 = Promedio: 5.4
 * Listado de estudiantes con su nota por debajo del promedio: 
 * Estudiante3 = Promedio: 3.73
 * Estudiante7 = Promedio: 2.49
 * Estudiante9 = Promedio: 1.21
 * Estudiante10 = Promedio: 0.17
 * Estudiante12 = Promedio: 1.2
 * Estudiante13 = Promedio: 2.18
 * Estudiante16 = Promedio: 2.68
 * Estudiante17 = Promedio: 4.63
 * Estudiante18 = Promedio: 2.85
 * Estudiante19 = Promedio: 1.14
 * Estudiante21 = Promedio: 3.29
 * Estudiante22 = Promedio: 0.38
 * Estudiante23 = Promedio: 2.28
 * Estudiante24 = Promedio: 4.09
 * Estudiante26 = Promedio: 2.33
 * Estudiante con la mejor calificacion:
 * Estudiante11 = Calificacion: 9.59
 * Estudiante con la calificacion mas baja:
 * Estudiante10 = Calificacion: 0.17
 */
  
