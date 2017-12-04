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
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
        int num;
        System.out.println("Potencia  2");
        System.out.print("Introduzca un numero: ");
        num = ingresar.nextInt();
        Potencia(num);
    }//fin main

    public static void Potencia(int num){
        int i;
        for(i= 1; i <= num; i++){
            System.out.println(i + "^2 = " + (int)(Math.pow(i,2)) );
        }
    }

}
