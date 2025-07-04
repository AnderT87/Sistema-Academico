/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

/**
 *
 * @author SO-LAB-PC6
 */
public class Decanos implements IDecanos {

    private Decano [] decanos; 
    private int totalDecanos; 
    
    public Decanos(int dimension) {
        decanos = new Decano [dimension];
        totalDecanos= 0; 

    }
    
    @Override
    public boolean AgregarDecanos (Decano decano){
        if (totalDecanos == decanos.length){
            return false; 
        }   else {
            decanos [totalDecanos] = decano; 
            totalDecanos = totalDecanos +1; 
            return true ;
        }
    }
    @Override
    public void imprimirDatos (){
        for (int i =0; i < totalDecanos; i++){ 
            System.out.println("------DECANO------"+"|"+(i+1)+"|");
            System.out.println("Datos decano: "+ decanos[i].getNivelJerarquico());
        
        }
    }
    @Override
    public boolean actualizarDecano (int i, Decano decano){
        decanos [i] = decano;
        return true; 
    }
    @Override
    public boolean eliminarDecano (int i, Decano decano){
        decanos [i] = decano; 
        return true; 
    }
    
}
