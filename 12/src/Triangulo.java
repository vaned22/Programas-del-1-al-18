import java.util.Scanner;

/**
 *
 *
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int desigual = 0, l1, l2, l3;
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Desigualdad Triangular");
        System.out.print("Ingresar el lado 1: ");
        l1 = ingresar.nextInt();

        System.out.print("Ingresar el lado 2: ");
        l2 = ingresar.nextInt();

        System.out.print("Ingresar el lado 3: ");
        l3 = ingresar.nextInt();

        if ((l1 + l2) < l3) {
            desigual++;
        }
        if ((l1 + l3) < l2) {
            desigual++;
        }
        if ((l2 + l3) < l1) {
            desigual++;
        }
        if (desigual > 0) {
            System.out.println("No es un triangulo ");
        } else {
            tipo(l1, l2, l3);
        }

    }

    public static void tipo(int l1, int l2, int l3) {
        if (l1 == l2 && l1 == 3) {
            System.out.println(" equilatero");
        }
        if (l1 == l2 && l1 != l3 || l1 == l3 && l1 != l2 || l2 == l3 && l2 != l1) {
            System.out.println(" isosceles");
        }
        if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println(" escaleno");
        }

    }
}
