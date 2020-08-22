/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author morozco
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro = new Perro("Pastor Alemán","fido","concentrado",5);
        
//        perro.setNombre("fido");
//        perro.setEdad(5);
//        perro.setTipo_alimentacion("concentrado");
//        perro.setRaza("Pastor Alemán");
        
        perro.mostrar();
        
    }
    
}
