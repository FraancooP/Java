public class Tema4 {
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean) {
            System.out.println("La bandera es verdadera.\n");
        }else{
            System.out.println("La bandera es falsa.\n");
        }
        
        var edad = 10;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.\n");
        }else{
            System.out.println("Eres menor de edad.\n");
        }  
    }
}
