/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Precio;

/**
 *
 * @author PC MASTER
 */
public class Precio {
    private double pesos;
    
    public Precio(){}
    
    public Precio(double pesos){
        this.pesos=pesos;
    }
    public double getPesos(){
        return pesos;
    }
    
    public void setPesos(double pesos){
        this.pesos=pesos;
    }
}
