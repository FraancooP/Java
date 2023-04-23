import java.util.Scanner;
public class EjercicioNumMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero 1: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero 2: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es: ");
        System.out.println((int) (numero1 > numero2 ? numero1 : numero2)); 
    }
}
