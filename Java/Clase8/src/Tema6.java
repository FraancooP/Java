import java.text.DecimalFormat;
public class Tema6 {
    public static void main(String[] args) {
        var patron = "#";
        DecimalFormat decimalformat = new DecimalFormat(patron);
        var numero = 8.5;
        var redondeo = Math.round(numero);
        System.out.println("Valor " + numero + " redondeado = " + redondeo);
        var truncado = decimalformat.format(numero);
        System.out.println("Valor " + numero + " truncado = " + truncado);
        
        
    }
}
