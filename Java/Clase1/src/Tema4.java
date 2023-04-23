import java.util.Scanner;
public class Tema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre.");
        var usuario = scanner.nextLine();
        System.out.println("usario = " + usuario);
        System.out.println("Escribe tu titulo.");
        var titulo = scanner.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        
    }
    
}
