/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cac5parte2;

/**
 *
 * @author PC MASTER
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(){
    super();    
    }
    
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominate){
        this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
        this.lenguajeDominante=lenguajeDominante;
    }
    
    public Programador(String nombre,String cedula,int edad,boolean casado,double salario,int lineasDeCogigoPorHora, String lenguajeDominante){
    super(nombre,cedula,edad,casado,salario);
    this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
    this.lenguajeDominante=lenguajeDominante;    
    
    }
    
    
}
