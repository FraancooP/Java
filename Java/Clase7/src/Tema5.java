public class Tema5 {
static void cambiarValor(String parametro){
    parametro = "Adios";
}    
    public static void main(String[] args) {
        var argumento = "Hola";
        System.out.println("Antes de llamar a la funcion " + argumento);
        cambiarValor(argumento);
        System.out.println("Despues de llamar a la funcion " + argumento);
    }
}
