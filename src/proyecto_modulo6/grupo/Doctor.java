/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_modulo6.grupo;

/**
 *
 * @author Edith Quintanilla
 */
public class Doctor extends persona {
    public Doctor (){
        establecerNombre("Carlos Ramirez");
        establecerIdentidad("0102-1989-39300");
    } 
    @Override 
    public String especialidad(){
        return "Ginecologo";
        
    }
    @Override 
    String Diciplina(){
       
}
