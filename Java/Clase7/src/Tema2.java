import java.util.Scanner;
public class Tema2 {
    static int sumar(int a, int b){
        int resultadoSuma = a + b;
        return  resultadoSuma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero:");
        int num2 = Integer.parseInt(scanner.nextLine());
        var resultado = sumar(num1,num2);
        System.out.println("La suma de los dos numeros es: " + resultado);
    }
}
