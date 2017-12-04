/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Division{

    Stack<Boolean> pila = new
            Stack<Boolean>();
    public void dividir(int num1,int num2){
        if(pila.push((boolean)((num1%num2==0)))){

            System.out.print ("La division es " + num1+"/"+num2+" exacta ");
        }else{
            System.out.print("La división  "+ num1+"/"+ num2 + "No es exacta");}
    }
}
