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
public class Cuadrado extends Figura {
    private int lado;
    
    
    public Cuadrado(){}
    
    public Cuadrado(String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    
    public Cuadrado(int lado){
        this.lado=lado;   
    }
    public int getLado(){
        return lado;
    }
    public void setLado(int lado){
        this.lado=lado;
    }
    
    
    public int calcularArea(){
        return lado*lado;
    }
    public int calcularPerimetro(){
        return lado*4;
    }
    
    @Override
    public void dibujar(){
        
    }
}
