public class Punto3 {
    public void ejercicio3(){
        LLenarMatriz ll = new LLenarMatriz();
        int tam = 5;
        int [][] matriz3 = ll.llenarMatriz(tam);
        int [] sumFilas = new int[tam];
        int [] sumColumnas = new int [tam];
        int sumaF, sumaC;

        System.out.println("\n ----- EJERCICIO 3 ----- \n");

        // Suma de filas y agregación a arreglo ...
        for(int i = 0; i < tam; i++){
            sumaF = 0;
            for(int j = 0; j < tam; j++){
                sumaF += matriz3[i][j];
            }
            sumFilas[i] = sumaF;
        }

        // Suma de columnas y agregación a arreglo ... 
        for(int i = 0; i < tam; i++){
            sumaC = 0;
            for(int j = 0; j < tam; j++){
                sumaC += matriz3[j][i];
            }
            sumColumnas[i] = sumaC;
        }

        // Se recorre arreglo de suma de filas y se imprime ...
        System.out.println("\nLa suma de las filas es : ");
        for(int i = 0; i < sumFilas.length; i++){
            System.out.print(sumFilas[i] + " ");
        }

        // Se recorre arreglo de suma de columnas y se imprime ...
        System.out.println("\nLa suma de las columnas es : ");
        for(int i = 0; i < sumColumnas.length; i++){
            System.out.print(sumColumnas[i] + " ");
        }
    }
}
