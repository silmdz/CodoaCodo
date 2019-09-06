/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author PC MASTER
 */
public class Circulo extends Figura{
    private int radio;
    
    public Circulo(){}
    
    public Circulo(String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    public Circulo(int radio){
        this.radio=radio;
    }
    public int getRadio(){
        return radio;
    }
    public void setRadio(int radio){
        this.radio=radio;
    }
    public int calcularArea(){
        return (int) (Math.PI*radio);
    }
    public int calcularPerimetro(){
        return (int) (2*Math.PI*radio);
    }
    @Override
    public void dibujar(){
        
    }
    
    
}
