import java.util.Scanner;
public class Tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        System.out.println("Proporciona tu edad.\n");
        var miEdad = Integer.parseInt(scanner.nextLine());
        System.out.println("miEdad = " + miEdad);
        
        var caracter = "hola".charAt(0);//Char at nos permite ver 1 letra expecifica, comienza contando en 0
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter.\n");
        caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
