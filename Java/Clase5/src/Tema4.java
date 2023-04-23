public class Tema4 {
    public static void main(String[] args) {
        inicio:
        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue inicio;
            }
            System.out.println("contador = " + i);
        }
    }
    
}
