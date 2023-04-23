public class Tema6 {
    public static void main(String[] args) {
        int[][] matriz = {
            {100,200,300},
            {400,500,600}
        };
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
        System.out.println("Valor 4 [1][0] = " + matriz[1][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
        
        //ITERACION DE MATRIZ
        System.out.println("---------Iteramos la matriz-----------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz [" + i + "][" + j +"] = " + matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        
    }
    
}
