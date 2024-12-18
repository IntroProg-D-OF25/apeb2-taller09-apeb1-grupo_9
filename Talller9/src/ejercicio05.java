/***
 *Dados los siguientes arreglos
 * double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
 *String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
 * "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
 * auotor:Valeria
 */
public class ejercicio05 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez","Mark Hogan","Teresa Martinez" 
                ,"Julia Johnson","Mark Cook","Jennifer Manning","Juan Vasquez"};
        
        String[] promediosCualitativos = new String[7];
        
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Sobresaliente";
            }
        }

        System.out.println("Reporte de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " promedio: " + promedios[i] 
                    + " promedio cualitativo: " + promediosCualitativos[i]);
        }
    }
}
/***
 * Reporte de estudiantes:
Kimberly Gonzalez promedio: 10.0 promedio cualitativo: Sobresaliente
Mark Hogan promedio: 10.0 promedio cualitativo: Sobresaliente
Teresa Martinez promedio: 9.1 promedio cualitativo: Sobresaliente
Julia Johnson promedio: 7.0 promedio cualitativo: Bueno
Mark Cook promedio: 6.1 promedio cualitativo: Bueno
Jennifer Manning promedio: 4.0 promedio cualitativo: Regular
Juan Vasquez promedio: 8.0 promedio cualitativo: Bueno
 */
