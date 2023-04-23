public class Tema1 {
    public static void main(String[] args) {
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion verdadera.\n");
        }else{
            System.out.println("Condicion falsa.\n");
        }
        
        var numero = 5;
        var numeroTexto = "Numero Desconocido";
        
        if (numero == 1) {
            numeroTexto = "Numero uno";
        }else if(numero == 2){
            numeroTexto = "Numero dos";
        }else if(numero == 3){
            numeroTexto = "Numero tres";
        }else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }else{
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
