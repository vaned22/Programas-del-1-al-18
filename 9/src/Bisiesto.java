import java.util.Scanner;
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        int numer;

        System.out.print("Ingresa  el año: ");
        numer = ingresar.nextInt();

        if(numer % 4 == 0){
            System.out.println("El  año es bisiesto");
        }
        else{
            System.out.println("el año no es bisiesto");
        }
    }

}
