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
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in);
        double real, decimal;
        int realnum;

        System.out.print("Introduca un  numero no. real: ");
        real = ingresar.nextDouble();
        realnum= (int)real;
        decimal = real - realnum;

        System.out.printf(" parte decimal : %f\n", decimal);
    }

}
