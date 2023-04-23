public class Tema3 {
static void cambiarValor(int parametro){
    parametro = 20;
}    
    public static void main(String[] args) {
        var argumento = 10;
        System.out.println("Antes de llamar a la funcion: " + argumento);
        cambiarValor(argumento);
        System.out.println("Despues de llamar a al funcion " + argumento);
    }
}
