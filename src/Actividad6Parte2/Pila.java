/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad6Parte2;

import java.util.NoSuchElementException;

/**
 *
 * @author PC MASTER
 */
public class Pila implements ColeccionInterfaz{
    
    private Object[] pilaArray;
    private int contDatos;
    
    
    public Pila (){}
    public Pila(int maximo){
        pilaArray=new Object[maximo];
        contDatos=0;
    }
    @Override
    public boolean estaVacia() {

    return contDatos == 0;
    }

    @Override
    public boolean anadir(Object objeto) {
    if (contDatos == pilaArray.length) {
    return false;
    } else {
    pilaArray[contDatos] = objeto;
    contDatos++;
    return true;
    }
    }

    
    @Override
    public Object primero(){
    if (estaVacia()) {
    throw new NoSuchElementException();
} else {
        
    return pilaArray[contDatos-1];
    }
    
}

    @Override
    public Object extraer() {
    if (estaVacia()) {
    throw new NoSuchElementException();
    } else {
       return pilaArray[-contDatos];
    }
    
  
}
    
    

  
    
    
    
}

    