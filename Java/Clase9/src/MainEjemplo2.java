public class MainEjemplo2 {
    public static void main(String[] args) {
        Ejemplo2 cuentaCredito;
        Ejemplo2 cuentaDebito;
        cuentaCredito = new Ejemplo2();
        cuentaDebito = new Ejemplo2();
        
        cuentaCredito.nombre = "Predro sanchez";
        cuentaCredito.setSaldo(1500);
        cuentaCredito.setNumero(244513);
        cuentaCredito.tipo = "credito";
        
        cuentaDebito.nombre = "Pablo Garcia";
        cuentaDebito.setSaldo(7800);
        cuentaDebito.setNumero(273516);
        cuentaDebito.tipo = "debito";
        
        cuentaCredito.imprimir();
        cuentaDebito.imprimir();
        
        
    }
    
}
