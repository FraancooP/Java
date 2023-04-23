import java.util.Scanner;
public class Tema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo: ");
        int largo = Integer.parseInt(scanner.nextLine());
        int []array = new int[largo];
        
        for (int i = 0; i < largo; i++) {
            System.out.println("Ingrese numeros: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Impresion del arreglo.\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enteros[" + i + "] = " + array[i]);
        }
    }
    
}
