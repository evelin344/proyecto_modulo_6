/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_modulo6.grupo;

/**
 *
 * @author EVELIN
 */
public abstract class persona{
    public String nombre;
    public String identidad;
 
public persona(){

} 
public void establecerNombre(String nombre){
    this.nombre=nombre;
}
public String obtenerNombre(){
    return this.nombre;
}
public void imprimirNombre(){
    System.out.println("nombre "+nombre);
}
  abstract String especialdad();
  abstract String Disciplina();
}