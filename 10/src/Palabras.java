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
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        String palabranumero1, palabranumero2, mayor = "";
        int cont1, cont2, diferencia;

        System.out.print("Introduzca una palabra: ");
        palabranumero1 = ingresar.next();
        System.out.print("Iintroduzca otra palabra: ");
        palabranumero2 = ingresar.next();
        cont1 = palabranumero1.length();
        cont2 = palabranumero2.length();
        diferencia = Math.abs(cont1 - cont2);

        if (cont1 > cont2){
            System.out.printf("\nLa palabra es mayor  %s\n", palabranumero1);
        }
        if (cont1 < cont2){
            System.out.printf("\nLa palabra es mayor  %s\n", palabranumero2);
        }
        if(cont1 == cont2){
            System.out.printf("\nLas palabras tienen la misma longitud\n");
        }

        System.out.printf("La diferencia es  %d letra(s)\n", diferencia);
    }

}
