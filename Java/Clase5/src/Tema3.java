public class Tema3 {
    public static void main(String[] args) {
        for(var contador = 0; contador < 3; contador++){
            System.out.println("contador = " + contador);
        }
        System.out.println("Continue.....");
        for(var contador = 0; contador < 3; contador++){
            if (contador % 2 != 0) {
                continue;
            }
            System.out.println("contador = " + contador);
        }
    }
}
