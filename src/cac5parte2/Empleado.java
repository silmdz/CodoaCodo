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
public class Empleado {
   private String nombre;
   private String cedula;
   private int edad;
   private boolean casado;
   private double salario;
   
   public Empleado (){}
   
   public Empleado (String nombre, String cedula, int edad, boolean casado, double salario){
       this.nombre=nombre;
       this.cedula=cedula;
       this.edad=edad;
       casado=false;
       this.salario=salario;
   
   }
    
   public String getNombre (){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   } 
   
   public String getCedula(){
       return cedula;
   }
   public void setCedula(String cedula){
       this.cedula=cedula;
   }
   
   public int getEdad(){
       return edad;
   }
   public void setEdad (int edad){
       this.edad=edad;
   }
   
   public boolean getCasado(){
       return casado;
   }
   public void esCasado(){
       casado=false;
   }
   public void esSoltero(){
       casado=true;
   }
   
   public double getSalario(){
       return salario;
   }
   public void setSalario(double salario){
       this.salario=salario;
   }
   
   public String clasificacion(){
       String a="";
       if (edad>=21){
           a="Principiante";
       }
       if (edad>=22&&edad<=35){
           a="Intermedio";
       }
       if (edad>35){
           a="Senior";
       }
       return a;
   }
   
   @Override
    public String toString(){
        return "Nombre= "+getNombre()+"Cédula= "+getCedula()+"Edad= "+getEdad()+"Casado= "+casado+"Salario= "+getSalario();
    }
    
    public void AumentarSalario(double incremento){
    salario = salario * (1 + incremento);
 }
  
}
    
   

