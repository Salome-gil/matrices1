
public class Punto2 {
    public void ElPunto2(int d) {
        Punto2 p2 = new Punto2();
        LLenarMatriz ll = new LLenarMatriz();
        int[][] matriz = new int[d][d];
        matriz = ll.llenarMatriz(d);

        p2.punto2(matriz);

    }

    public void punto2(int[][] matriz) {
        int max = matriz[0][0];
        int maxFila = 0;
        int maxColumna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        System.out.println("El número más grande es: " + max);
        System.out.println("Se encuentra en la fila: " + maxFila + ", columna: " + maxColumna);
    }

}
