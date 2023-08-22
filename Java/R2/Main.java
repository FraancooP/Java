//Mayor y menor de manera Recursiva.
/*
   El chiste esta en no utilizar el array.length, se debe mejorar eso, ademas, se estan mandando
   3 valores en cada funcion, la idea es no trabajar asi, sino con solamente 2 o (si es posible) 1 valor q seria 
   el arreglo.
   Tambien estaría bueno, no conocer el tamaño (que lo decida el usuario), y ademas, cargar los valores con un
   for each.
   
   */
import java.util.Scanner;
public class Main
{
    public static int maximo(int[] a, int pibote, int max){//El "pibote" vale 0, ya que asi deducimos el primer elemento del arreglo.
        if(pibote == a.length){//Comparamos si estamos en el primer elemento del arreglo.
            return max;
        }else{//Si no estamos en este primer elemento, comenzamos a guardar elemento por elemento en la variable "current"
            int current = a[pibote];
            if(current > max){//Por ultimo comparamos si este "current" es mas grande que el numero "max"(Deducir de donde sale max....)
                max = current;
            }
            return maximo(a,pibote + 1, max);//Y empezamos a realizar recursividad hasta que pibote consiga la misma cantidad de 
            //elementos que tiene a.lenght.
        }
    }
    public static int minimo(int[] a, int pibote, int min){//Lo mismo q hicimos en max, pero a la inversa.
        if(pibote == a.length){
            return min;
        }else{
            int current = a[pibote];
            if(current < min){
                min = current;
            }
            return minimo(a,pibote + 1, min);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        boolean salida = false;
        System.out.println("Ingrese 10 numeros.\n");
        for(int i=0;i<array.length;i++){
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        do{
            System.out.println("1)Buscar Menor.\n");
            System.out.println("2)Buscar Mayor.\n");
            System.out.println("3)Nuevos Valores.\n");
            System.out.println("4)Salir.\n");
            int op = Integer.parseInt(scanner.nextLine());
            switch(op){
                case 1:
                    int menor = minimo(array, 0, array[0]);
                    System.out.println("El numero mas chico del arreglo es: "+menor);
                    break;
                case 2:
                    int mayor = maximo(array, 0, array[0]);
                    System.out.println("El numero mas grande del arreglo es: "+mayor);
                    break;
                case 3:
                    System.out.println("Ingrese: \n");
                    for(int i=0;i<array.length;i++){
                        array[i] = Integer.parseInt(scanner.nextLine());
                    }
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
