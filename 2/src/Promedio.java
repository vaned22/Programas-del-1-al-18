/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *  */


import javax.swing.JOptionPane;

public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double notauno =Double.parseDouble(JOptionPane.showInputDialog(" nota 1: "));
        double notados =Double.parseDouble(JOptionPane.showInputDialog("nota2 : "));
        double notatres =Double.parseDouble(JOptionPane.showInputDialog("nota 3: "));
        double notacuatros =Double.parseDouble(JOptionPane.showInputDialog("nota 4: "));
        double Promedio=(notauno+notados+notatres+notacuatros)/4;

        if(Promedio%(int)Promedio==0){
            JOptionPane.showMessageDialog(null,"El promedio es: "+ (int)Promedio);
        }else{
            JOptionPane.showMessageDialog(null,"El promedio es: "+ Promedio);
        }
    }

}
