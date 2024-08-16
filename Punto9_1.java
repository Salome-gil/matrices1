public class Punto9_1 {

    public void Punto9(int d) {
        LLenarMatriz ll = new LLenarMatriz();
        int[][] matriz = new int[d][d];
        matriz =ll.llenarMatriz(d);
        maximoMatriz(matriz);
        minimoMatriz(matriz);
        imprimirColumnaMaximo(matriz);
        imprimirFilaMaximo(matriz);
    }

    public static void maximoMatriz(int[][] matriz) {
        int maxValor = matriz[0][0];
        int maxFila = 0;
        int maxColumna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        System.out.println("Máximo valor: " + maxValor);
        System.out.println("Posición: (" + maxFila + ", " + maxColumna + ")");
    }

    public static void minimoMatriz(int[][] matriz) {
        int minValor = matriz[0][0];
        int minFila = 0;
        int minColumna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < minValor) {
                    minValor = matriz[i][j];
                    minFila = i;
                    minColumna = j;
                }
            }
        }

        System.out.println("Menor valor: " + minValor);
        System.out.println("Posición: (" + minFila + ", " + minColumna + ")");
    }

    public static void imprimirColumnaMaximo(int[][] matriz) {
        int maxFila = 0;
        int maxColumna = 0;
        int maxValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        System.out.println("Columna " + maxColumna + " con el valor máximo:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][maxColumna]);
        }
    }

    public static void imprimirFilaMaximo(int[][] matriz) {
        int maxFila = 0;
        int maxColumna = 0;
        int maxValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        System.out.println("Fila " + maxFila + " con el valor máximo:");
        for (int j = 0; j < matriz[maxFila].length; j++) {
            System.out.print(matriz[maxFila][j] + " ");
        }
        System.out.println();
    }

}
