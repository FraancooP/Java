import java.util.Scanner;
public class Recursiva
{
    public static int binario(int n){
    if(n>1){
        binario(n/2);
    }
    System.out.println(n%2 + "\t");
    return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para convertir a binario.\n");
        int numero = Integer.parseInt(scanner.nextLine());
        binario(numero);
    }
}
