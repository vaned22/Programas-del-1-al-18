
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
public class Divisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int numero, p, divisor = 0, iterar = 0, aux = 0;

        System.out.println("DIVISORES");
        System.out.print("Introduzca un numero: ");
        numero = ingresar.nextInt();

        if(numero % 2 == 0){
            iterar = numero/ 2;
        }
        else{
            iterar = (numero - 1) / 2;
        }
        for(i = 1; i <= iterar; p++){
            if(num % p == 0){
                aux = num / p;
                if(aux != divisor){
                    divisor = aux;
                }
                if(i == iterar){
                    System.out.println(divisor);
                }
                else{
                    System.out.print(divisor + ",");
                }
            }
        }
    }

}


