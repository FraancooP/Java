public class Tema4 {
static void cambiarValor(int [] parametro){
    parametro[0] = 20;
}    
    public static void main(String[] args) {
        int[] argumento = {10};
        System.out.println("Antes de llamar a la funcion: " + argumento[0]);
        cambiarValor(argumento);
        System.out.println("Despues de llamar a la funcion: " + argumento[0]);
    }
}
