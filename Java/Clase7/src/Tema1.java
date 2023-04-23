import java.util.Scanner;
public class Tema1 {
    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el mensaje a mostrar: ");
        var mensajeArg = scanner.nextLine();
        saludar(mensajeArg);
    }
}
