public class Tema7 {
static void funcionRecursiva(int numero){
    if (numero == 0) {
        System.out.println("numero");
    }else{
        funcionRecursiva( numero - 1);
        System.out.println(numero);
    }
}   
    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
