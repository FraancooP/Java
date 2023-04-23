public class MainEjemplo3 {
    public static void main(String[] args) {
        Ejemplo3 f = new Ejemplo3();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        
        System.out.println("Dia = " + f.getDia());
        System.out.println("Mes = " + f.getMes());
        System.out.println("Anio = " + f.getAnio());
        System.out.println(f);
        f.toString();
    }
    
}
