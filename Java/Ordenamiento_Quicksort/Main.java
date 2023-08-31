import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean salida = false;
        int op = 0;
        int[] array = new int[10];
        int n = array.length;
        System.out.println("Ordenamiento QuickSort.\n");
        do{
            System.out.println("1)Generar 10 numeros aleatorios(entre 1 y 100).\n");
            System.out.println("2)Mostrar numeros aleatorios.\n");
            System.out.println("3)Ordenar los numeros.\n");
            System.out.println("4)Salir.\n");
            op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    for(int i=0;i<array.length;i++){
                        array[i]=random.nextInt(100 - 0 + 1) + 0;
                    }
                    System.out.println("Arreglo generado.\n");
                    break;
                case 2:
                    for(int num : array){
                        System.out.println(num + " ");
                    }
                    break;
                case 3:
                    
                    System.out.println("Numeros Ordenados.\n");
                    break;
                case 4:
                    salida = true;
                    break;
                default:
                    break;
            }
        }while(!salida);
        System.out.println("Adios.\n");
    }
    public static void quicksort(int[] item,int left, int right){
    }
}
