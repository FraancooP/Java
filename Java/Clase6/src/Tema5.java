import java.util.Scanner;
public class Tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int  FILAS = 2;
        final int COLUMNAS = 3;
        
        int[][] matriz = new int[FILAS][COLUMNAS];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
        System.out.println("Valor 4 [1][0] = " + matriz[1][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
        
        
        
        
    }
    
}
