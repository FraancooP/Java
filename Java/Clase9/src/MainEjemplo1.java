public class MainEjemplo1 {
    public static void main(String[] args) {
        Ejemplo1 e;
        Ejemplo1 f;
        e = new Ejemplo1();
        f = new Ejemplo1();
        e.a = 7;
        e.hacerAlgo();
        f.x = e.suma();
        f.a = f.x + e.a;
        e.a = f.suma();
        e.imprimir();
        f.imprimir();
        
        
        
        
        
    }
    
}
