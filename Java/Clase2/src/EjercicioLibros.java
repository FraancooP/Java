import java.util.Scanner;
public class EjercicioLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre.\n");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el ID.\n");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio.\n");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito.\n");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
        
        
        
        
        
        
    }
}
