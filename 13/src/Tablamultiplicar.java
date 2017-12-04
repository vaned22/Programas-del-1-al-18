/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/*
*
 *
 */
public class Tablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un numero: ");
        num = ingresar.nextInt();
        tabla(num);

    }//fin main
    public static void tabla(int num){
        int v;
        for(v = 1; v<=10; v++){
            System.out.printf("%d x %d = %d\n",num, v, (v * num) );
        }
    }

}

