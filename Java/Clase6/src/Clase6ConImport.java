import java.util.Scanner;
public class Clase6ConImport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas, columnas;
        System.out.println("Ingrese las filas.\n");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese las columnas,\n");
        columnas = Integer.parseInt(scanner.nextLine());
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dato[" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("MOSTRANDO MATRIZ.......................");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz [" + i + "][" + j +"] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
