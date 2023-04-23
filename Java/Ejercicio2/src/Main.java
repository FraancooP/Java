//Enunciado:
//Crea una clase llamada "Estudiante" que tenga los siguientes atributos: nombre (String), edad (int),
//promedio (double), materia (String) y un arreglo de calificaciones (int[]) que representa las calificaciones del 
//estudiante en diferentes evaluaciones
//(cada evaluación tiene una calificación de 0 a 10).
//La clase "Estudiante" debe tener las siguientes funciones:
//Una función llamada "calcularPromedio" que calcule el promedio de las calificaciones del estudiante y lo asigne al atributo 
//"promedio".
//Una función llamada "agregarCalificacion" que reciba una calificación como parámetro y la agregue al arreglo de calificaciones.
//Una función llamada "obtenerPromedio" que devuelva el promedio del estudiante.
//Una función llamada "imprimirCalificaciones" que imprima en pantalla las calificaciones del estudiante, indicando el número 
//de evaluación y
//la calificación correspondiente.
//Luego, en el programa principal, crea un arreglo de objetos "Estudiante" y pide al usuario que ingrese los datos de varios
//estudiantes
//(nombre, edad, materia y calificaciones). Para cada estudiante, llama a la función "calcularPromedio"
//para calcular su promedio y a la función "imprimirCalificaciones" para imprimir en pantalla sus calificaciones.
//Finalmente, imprime en pantalla el nombre y promedio del estudiante con el promedio más alto.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] calificaciones;
        calificaciones = new int[3];//Rango del arreglo
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante1;
        estudiante1 = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante.");
        estudiante1.setNombre(scanner.nextLine());
        System.out.println("Ingrese la edad del estudiante.\n");
        estudiante1.setEdad(Integer.parseInt(scanner.nextLine()));
        System.out.println("Ingrese la materia que esta cursando.\n");
        estudiante1.setMateria(scanner.nextLine());
        System.out.println("Ingrese las calificaciones de los ultimos 3 parciales.\n");
        for (int i = 0; i < 3; i++) {
            calificaciones[i]=Integer.parseInt(scanner.nextLine());
        }
        estudiante1.agregarCalificacion(calificaciones);
        estudiante1.imprimirCalificaciones();
        estudiante1.imprimirAlumno();
    }
}
