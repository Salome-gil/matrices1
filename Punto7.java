public class Punto7{
    public static void main(String[] args) {
        int [][]num;
        num = new int[5][6];
       
        int conteoCeros = 0;
        int conteoPositivos = 0;
        int conteoNegativos = 0;
 
        for(int i = 0; i< num.length; i++){
 
            for(int j= 0; j< num[i].length; j++){
 
                num[i][j] = (int)(Math.random()* 21) - 10;
               
                if(num[i][j] == 0){
 
                    conteoCeros++;
 
                }
                else if (num[i][j]>0) {
                   
                    conteoPositivos++;
 
                }
                else{
 
                    conteoNegativos++;
 
                }
            }            
           
        }
 
        System.out.println("Matriz: ");
 
        for(int i = 0; i< num.length; i++){
 
            for(int j = 0; j< num[i].length; j++){
 
                System.out.print(num[i][j] + "\t");
           
            }
           System.out.println();
           
        }
        System.out.println("\nCantidad de ceros: " + conteoCeros);
        System.out.println("Cantidad de positivos: " + conteoPositivos);
        System.out.println("Cantidad de negativos: " + conteoNegativos);
 
       
    }
}
