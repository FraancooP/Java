public class Ejemplo2 {
public String nombre;
private double saldo;
private int numero;
public String tipo;
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

public void depositar(double deposito){
    saldo = saldo + deposito;
}
public void retirar(double retiro){
    if (saldo >= retiro) {
        saldo = saldo - retiro;
    }
}
public void imprimir(){
    System.out.println("La cuenta es de " + nombre + ", numero " + numero + ". Es una cuenta de " + tipo +", con saldo: " + saldo + "\n");
    
}









}
