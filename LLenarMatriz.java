public class LLenarMatriz {
    public int[][] llenarMatriz(int dim) {

        int[][] matriz = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return matriz;

    }

}