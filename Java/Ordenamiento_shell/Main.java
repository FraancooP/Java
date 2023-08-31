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
        System.out.println("Ordenamiento Shell.\n");
        do{
            System.out.println("1)Generar numeros aleatorios(entre 1 y 10).\n");
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
                    /*int gap,i,j,temp;
                    for(gap = n/2;gap > 0;gap /=2){
                        for(i = gap; i<array.length;i++)
                            for(j = i - gap; j >= 0 && array[j] > array[j+gap] ; j -= gap){
                                temp = array[j+gap];
                                array[j+gap] = temp;
                            }
                    }*/
                    //El codigo de arriba no ordena. El de abajo esta corregido por gpt, estudiar sus diferencias.
                    int gap,i,j,temp;
                    for(gap = n/2;gap > 0; gap /=2){
                        for (i = gap; i < array.length; i++){
                            temp = array[i];
                            for (j = i; j >= gap && array[j - gap] > temp; j -= gap){
                                array[j] = array[j - gap];
                            }
                            array[j] = temp;
                        }
                    }
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
}
