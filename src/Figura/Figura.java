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
public abstract class Figura {
    private String nombre;
    private int GrosorBorde;
    private int Color;
    
    public Figura(){}
    public Figura(String nombre, int GrosorBorde,int Color){
        this.nombre=nombre;
        this.GrosorBorde=GrosorBorde;
        this.Color=Color;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getGrosorBorde(){
        return GrosorBorde;
    }
    public void setGrosorBorde(int GrosorBorde){
        this.GrosorBorde=GrosorBorde;
    }
    public int getColor(){
        return Color;
    }
    public void setColor(int Color){
        this.Color=Color;
    }
    
    public abstract void dibujar();
        
    
    
}
