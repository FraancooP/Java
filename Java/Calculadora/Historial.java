public class Historial extends Main {
    private float num1;
    private float num2;
    private float resultado;
    private String operacion;
    
    public Historial(float num1, float num2, float resultado, String operacion){
    this.num1=num1;
    this.num2=num2;
    this.operacion=operacion;
    this.resultado=resultado;
    }
    @Override
    public String toString(){
        return "Numero1: "+num1+"\nNumero2: "+num2+"\nOperacion: "+operacion+"\nResultado: "+resultado;
    }
}
