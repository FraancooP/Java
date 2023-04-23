import java.util.Scanner;
public class EjercicioRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el alto del rectangulo.\n");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el ancho del rectangulo.\n");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
