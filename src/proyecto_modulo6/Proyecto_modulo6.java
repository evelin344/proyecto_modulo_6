/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_modulo6;

import proyecto_modulo6.grupo.Doctor;

/**
 *
 * @author EVELIN
 */
public class Proyecto_modulo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor Doctor=new Doctor();
       System.out.println(Doctor.especialidad());
       Doctor.imprimirNombre();
       Doctor.imprimirIdentidad();
    }
    
}
