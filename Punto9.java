

public class Punto9 {
    public int maximon(int dim) {
        LLenarMatriz ll = new LLenarMatriz();
        int[][] Maxn = new int[dim][dim];
        Maxn = ll.llenarMatriz(dim);
        int numero = 0;

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {

                if (numero < Maxn[i][j]) {
                    numero = Maxn[i][j];
                }

            }

        }

        return numero;
    }

}
