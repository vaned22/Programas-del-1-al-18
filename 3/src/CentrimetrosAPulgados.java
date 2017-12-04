/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
import java.util.Scanner;
public class CentrimetrosAPulgados {

    /**
     *
     */
    public static void main(String Args []){
        Scanner t = new Scanner(System.in);

        double Cm= 2.54;
        double pulgadas, centimetros;

        System.out.print("Valor en pulgadas es: ");
        pulgadas = t.nextDouble();

        centimetros = pulgadas * Cm;

        System.out.println("Valor en Centímetros: " + centimetros);
    }
}
