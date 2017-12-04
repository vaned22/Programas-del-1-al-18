/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c, d;

        for (c = 1; c <= 10; c++) {
            for (d = 1; d <= 10; d++) {
                if (c * d < 10) {
                    System.out.print(c * d + "  ");
                } else {
                    System.out.print(c * d + " ");
                }
                if (d == 10) {
                    System.out.println("");
                }
            }

        }
    }
}
