import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main
{
  public static float suma(float n1, float n2){
      
      float resultado = n1+n2;
      return resultado;
  }
   public static float resta(float n1, float n2){
      float resultado = n1-n2;
      return resultado;
  }
    public static float multiplicacion(float n1, float n2){
      float resultado = n1*n2;
      return resultado;
  }
     public static float division(float n1, float n2){
      float resultado = n1/n2;
      return resultado;
  }
  public static void main(String[] args) {
      List<Historial> lista = new ArrayList<>();
      boolean salida = false;
      var op = 0;
      Scanner scanner = new Scanner(System.in);
      float numero1 = 0.0f;
      float numero2 = 0.0f;
      float resultado = 0.0f;
      System.out.println("Bienvenido a la Calculadora magica.\n");
      System.out.println("Ingrese 2 numeros.\n");
      numero1 = Float.parseFloat(scanner.nextLine());
      numero2 = Float.parseFloat(scanner.nextLine());
      do{
        System.out.println("1)Sumar\n");
        System.out.println("2)Restar\n");
        System.out.println("3)Multiplicar\n");
        System.out.println("4)Dividir\n");
        System.out.println("5)Agregar otros valores\n");
        System.out.println("6)Mostrar Historial\n");
        System.out.println("7)Salir\n");
        op = Integer.parseInt(scanner.nextLine());
        switch(op){
            case 1:
                resultado = suma(numero1,numero2);
                System.out.println("El resultado de la suma es: " +resultado);
                lista.add(new Historial(numero1,numero2,resultado,"Suma"));
                break;
            case 2:
                resultado = resta(numero1,numero2);
                System.out.println("El resultado de la resta es: " + resultado);
                lista.add(new Historial(numero1,numero2,resultado,"Resta"));
                break;
            case 3:
                resultado = multiplicacion(numero1,numero2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                lista.add(new Historial(numero1,numero2,resultado,"Multiplicacion"));
                break;
            case 4:
                resultado = division(numero1,numero2);
                System.out.println("El resultado de la division es: " + resultado);
                lista.add(new Historial(numero1,numero2,resultado,"Division"));
                break;
            case 5:
                System.out.println("Ingrese los nuevos valores.\n");
                numero1 = Float.parseFloat(scanner.nextLine());
                numero2 = Float.parseFloat(scanner.nextLine());
                break;
            case 6:
                for(Historial histoo : lista){
                    System.out.println(histoo.toString());
                }
                break;
            case 7:
                 salida=true;
                break;
            default:
                System.out.println("No se elijio ninguna opcion valida.\n");
                break;
            }
        }while(!salida);
        System.out.println("Gracias que tenga un buen dia.\n");
  }
}