import java.util.Scanner;
public class Tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        var numero = Integer.parseInt(scanner.nextLine());
        var numeroAbs = Math.abs(numero);
        System.out.println("Valor abosuluto de " + numero +" = " + numeroAbs);
        
    }
    
}
