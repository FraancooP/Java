public class Calculadora {
    private int num1;
    private int num2;
    public int suma;
    public int resta;
    public int multi;
    public int divi;
    public void setNum1(int num1){
    this.num1 = num1;
    }
    public int getNum1(){
    return num1;
    }
    public void setNum2(int num2){
    this.num2 = num2;
    }
    public int getNum2(){
    return num2;
    }
    public void sumar(){
        suma = num1 + num2;
    }
    public void restar(){
    resta = num1 - num2;
    }
    public void multiplicacion(){
    multi =  num1 * num2;
    }
    public void division(){
        if (num2 == 0) {
            divi = 0;
        }else{
            divi = num1 / num2;
        }
    }
    public void imprimir(){
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + multi);
        if(divi == 0){
            System.out.println("La division por 0 no existe");
        }else{
        System.out.println("La division de los dos numeros es: " + divi);
        }
    }
}
