import java.util.Scanner;
public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int[] opciones ={1,2,3,4,5,6,7,8,9,10,11};
            int seleccion =-1;
            while (seleccion != 0) {
                System.out.println("Menu principal");
                for (int i = 0; i < opciones.length; i++) {
                }

                System.out.println("Seleccione el ejercicio que desea ejercutar");
                System.out.println("Digite ejercicios del 1 al 11");
                System.out.println("Digite 0 para salir");
                seleccion = sc.nextInt();
                if (seleccion >= 1 && seleccion <=opciones.length) {
                    switch (seleccion) {
                        case 0:
                        System.out.println("Adios");
                        System.exit(0);
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        default:
                        System.out.println("Opcion no valida");
                        
                    }
                }
            }  


        }
    }
}