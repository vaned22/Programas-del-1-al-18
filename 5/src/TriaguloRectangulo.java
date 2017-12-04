/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
import java.util.Scanner;
/**
 *
 *
 */
public class TriaguloRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        int catA, catB, sumaCat;
        double hipotenusa;

        System.out.print("Introduzca el primer cateto: ");
        catA = ingresar.nextInt();
        System.out.print("Introduzca el segundo cateto: ");
        catB = ingresar.nextInt();

        catA = catA * catA;
        catB = catB * catB;
        sumaCat = catA + catB;
        hipotenusa = Math.sqrt(sumaCat);

        System.out.println("La hipotenusa  es la siguiente : "+ hipotenusa);
    }

}
