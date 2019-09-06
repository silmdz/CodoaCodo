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
public class Triangulo extends Figura {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    public Triangulo(){}
    public Triangulo(String nombre,int GrosorBorde,int Color){
        super(nombre,GrosorBorde,Color);
    }
    public Triangulo(int base,int altura,int lado1,int lado2){
        this.base=base;
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
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
        public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
        public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    
    public int calcularArea(){
        return (base*altura)/2;
    }
    public int calcularPerimetro(){
        if(lado1==lado2&&lado1==base){
            return 3*lado1;
        }
        if(lado1==lado2&&lado1!=base){
            return 2*lado1+base;
        }
        else
             return lado1+lado2+base;
    }
    
    @Override
    public void dibujar(){
        
    }
    
    
        
    
    
    
}
