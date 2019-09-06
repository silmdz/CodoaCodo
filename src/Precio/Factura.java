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
public class Factura extends Precio {
    private int cliente;
    private String emisor;
    
    public Factura (){
        
    }
    public Factura (int cliente,String emisor){
        this.cliente=cliente;
        this.emisor=emisor;
    }
    public Factura (double pesos,int cliente,String emisor){
        super(pesos);
        this.cliente=cliente;
        this.emisor=emisor;
    }
    
    public int getCliente(){
        return cliente;
    }
    public void setCliente( int cliente){
        this.cliente=cliente;
    }
    
    public String getEmisor(){
        return emisor;
    }
    public void setEmisor(String emisor){
        this.emisor=emisor;
    }
    
    
}
