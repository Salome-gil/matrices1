import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {

        int[][] nn = new int[2][2];
        int[] suma_filas = new int[2];
        int[] suma_columnas = new int[2];
        int sumaC = 0, acumClumnas = 0, sumaf = 0, acumf = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("ingrese el numero ");
                nn[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumaf = sumaf + nn[i][j];
            }
            suma_filas[acumf] = sumaf;
            acumf++;
            sumaf =0;

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumaC = sumaC + nn[j][i];
            }
            suma_columnas[acumClumnas] = sumaC;
            acumClumnas++;
            sumaC = 0;

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("  " + nn[i][j]);
            }
            System.out.println();
        }

        System.out.println("la suma de las columnas");
        for (int i = 0; i < suma_columnas.length; i++) {
            System.out.print("||" + suma_columnas[i]);
        }
        System.out.println();
        System.out.println("la suma de las filas");
        for (int i = 0; i < suma_filas.length; i++) {
            System.out.print("||" + suma_filas[i]);
        }
        System.out.println();
    }
}
