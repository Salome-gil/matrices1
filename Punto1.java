public class Punto1 extends LLenarMatriz{

    int[][] matriz = llenarMatriz(6);

    public int punto1(){

        int totalSumatoria = 0;
    
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {  
                totalSumatoria += matriz1[j];
            }
        }

        return totalSumatoria;
    }
    
}

