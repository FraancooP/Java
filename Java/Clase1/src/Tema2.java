public class Tema2 {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);//Se realiza la suma de las variables
        System.out.println(i + j + usuario);//Evaliazion de izquierda a derecha, realiza suma.
        System.out.println(usuario + i + j);//contexto cadena, todo es cadena.
        System.out.println(usuario + (i + j));//Parentesis modifica la prioridad en la evaluacion.
    }
    
}
