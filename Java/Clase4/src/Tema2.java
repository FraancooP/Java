public class Tema2 {
    public static void main(String[] args) {
        var mes = 4;
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
    }
}
