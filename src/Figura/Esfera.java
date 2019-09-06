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
public class Esfera extends Figura {
    private int radio;
    
        
    public Esfera(){}
    
    public Esfera(String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    public Esfera(int radio){
        this.radio=radio;
    }
    public int getRadio(){
        return radio;
    }
    public void setRadio(int radio){
        this.radio=radio;
    }
    
    public int calcularVolumen(){
        return (int) ((4/3*Math.PI)*(radio*radio*radio));
    }
    
    @Override
    public void dibujar(){
        
    }
    
    
}
