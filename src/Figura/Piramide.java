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
public class Piramide extends Figura {
    private int base;
    private int altura;
    private int lado;
    
    public Piramide(){}
    public Piramide (String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    public Piramide(int base,int altura,int lado){
        this.base=base;
        this.altura=altura;
        this.lado=lado;
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
        public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int calcularVolumen(){
        return (1/3*(lado*lado)*altura);
    }

   
    @Override
    public void dibujar(){
        
    }
    
}
