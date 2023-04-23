public class Tema1 {
    public static void main(String[] args) {
        var cadena = "Hola mundo";
        System.out.println("largo cadena: " + cadena.length());
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(i + " - " + cadena.charAt(i));
        }
        System.out.println("cadena = " + cadena);
        var subcadena1 = cadena.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        var subacadena2 = cadena.substring(5, 10);
        System.out.println("subacadena2 = " + subacadena2);
        
    }
}
