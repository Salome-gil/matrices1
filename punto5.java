
public class Punto5 {

    public int[] DevolverVec(int a) {
        int matriz[][] = new int[a][a];
        int[] Vector = new int[a * a];
        LLenarMatriz ll = new LLenarMatriz();
        matriz = ll.llenarMatriz(a);
        int dimv = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                Vector[dimv] = (matriz[i][j]);
                dimv++;
            }
        }
        return Vector;
    }
}