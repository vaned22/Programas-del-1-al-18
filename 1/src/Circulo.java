/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo (double radio){
        this.radio = radio;
    }
    public void CalcularArea (){
        area = 3.171592654 * (radio*radio);
    }
    public void CalcularPerimetro (){
        perimetro = 2*3.141592654;
    }
    public double getArea (){
        return area;
    }
    public double getPerimetro (){
        return perimetro;

    }
}

