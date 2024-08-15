public class punto4 {
    public static void punto4() {
        int[][] matriz = new int[10][10];
   
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
            }
        }

        int[] sumaColumnas = new int[10];
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        int maxSuma = Integer.MIN_VALUE;
        int columnaMaxSuma = -1;
        for (int j = 0; j < 10; j++) {
            if (sumaColumnas[j] > maxSuma) {
                maxSuma = sumaColumnas[j];
                columnaMaxSuma = j;
            }
        }

        System.out.println("\nColumna con la suma máxima: " + columnaMaxSuma);
        System.out.println("Suma de esa columna: " + maxSuma);
    }

}