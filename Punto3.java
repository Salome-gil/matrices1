public class Punto3 {
    public void ejercicio3(int tam) {
        LLenarMatriz ll = new LLenarMatriz();
        int[][] matriz3 = ll.llenarMatriz(tam);
        int[] sumFilas = new int[tam];
        int[] sumColumnas = new int[tam];
        int sumaF, sumaC;

        System.out.println("\n ----- EJERCICIO 3 ----- \n");

        // Suma de filas y agregación a arreglo ...
        for (int i = 0; i < tam; i++) {
            sumaF = 0;
            for (int j = 0; j < tam; j++) {
                sumaF += matriz3[i][j];
            }
            sumFilas[i] = sumaF;
        }

        // Suma de columnas y agregación a arreglo ...
        for (int i = 0; i < tam; i++) {
            sumaC = 0;
            for (int j = 0; j < tam; j++) {
                sumaC += matriz3[j][i];
            }
            sumColumnas[i] = sumaC;
        }

        // Se recorre arreglo de suma de filas y se imprime ...

        for (int i = 0; i < sumFilas.length; i++) {
            System.out.println("la suma de la fila: " + (i + 1)+ " es " + sumFilas[i] + " ");
        }

        // Se recorre arreglo de suma de columnas y se imprime ...

        for (int i = 0; i < sumColumnas.length; i++) {
            System.out.println("la suma de la columna: " + (i+1) + " es " + sumColumnas[i] + " ");
        }
    }
}
