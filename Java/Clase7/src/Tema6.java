public class Tema6 {
int i = 5;
static int atributoClase = 10;
    public static void main(String[] args) {
        var variableLocal = 20;
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Variable clase: " + atributoClase);
        System.out.println("Variable Instancia(objeto): " + new Tema6().i);
    }
}
