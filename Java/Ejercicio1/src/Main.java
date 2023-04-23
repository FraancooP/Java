import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculo = new Calculadora();
        System.out.println("Ingrese 2 numeros para operar");
        calculo.setNum1(Integer.parseInt(scanner.nextLine()));
        calculo.setNum2(Integer.parseInt(scanner.nextLine()));
        calculo.sumar();
        calculo.restar();
        calculo.multiplicacion();
        calculo.division();
        calculo.imprimir();
    }
}
