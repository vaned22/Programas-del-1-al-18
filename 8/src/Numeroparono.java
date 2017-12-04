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
public class Numeroparono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresa = new Scanner(System.in);
        int num;

        System.out.print("ingresar un numero: ");
        num = ingresa.nextInt();

        if (num % 2 == 0) {
            System.out.println("numero  par");
        } else {
            System.out.println(" numero  impar");
        }
    }
}

