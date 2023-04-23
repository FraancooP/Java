public class Tema3 {
    public static void main(String[] args) {
        int enteros[] = {100, 200, 300, 400};
        System.out.println("Largo del arreglo: " + enteros.length);
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros[" + i + "]= " + enteros[i]);
        }
        System.out.println("For each (for mejorado)");
        for (var numero : enteros) {
            System.out.println("Valor: " + numero);
        }
        
        
    }
    
}
