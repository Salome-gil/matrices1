public class Punto1 {

    LLenarMatriz ll = new LLenarMatriz();
    int[][] matriz = ll.llenarMatriz(6);

    public String punto1() {

        int totalSumatoria = 0;

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                totalSumatoria += matriz1[j];
            }
        }

        return "la sumatoria de los elementos de la matriz es: " + " " + totalSumatoria;
    }

}
