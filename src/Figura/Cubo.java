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
public class Cubo extends Figura {
   
    private int lado;
    
    
    public Cubo(){}
    
    public Cubo(String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    
    public Cubo(int lado){
        this.lado=lado;   
    }
    public int getLado(){
        return lado;
    }
    public void setLado(int lado){
        this.lado=lado;
    }
    
    
    public int calcularVoulmen(){
        return lado*lado*lado;
    }

    
    @Override
    public void dibujar(){
        
    }
}

    
    

