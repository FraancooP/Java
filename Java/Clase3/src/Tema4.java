public class Tema4 {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena;
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
        
        var g = a >= b;
        System.out.println("g = " + g);
        
        if (a % 2 == 0) {
            System.out.println("Es numero par");
        }else{
            System.out.println("Es numero impar");
        }
        var edad = 10;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        }else{
            System.out.println("Es menor de edad.\n");
        }
        
    }
    
}
