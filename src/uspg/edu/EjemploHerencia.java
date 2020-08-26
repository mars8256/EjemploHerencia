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
        

       Aves m= new Aves ("Paco","Alpiste",8,"Guacamaya");
       
       m.datos();
        
       
       
        
        mrzavalat mz = new mrzavalat();
        mz.setNombre("Mario ");
        mz.setApellido("Zavala ");
        mz.setFecha_nacimiento("26 de septiembre");
        mz.saludo();
        
        PracticaParcialBRSC PP = new PracticaParcialBRSC();
        PP.setNombre ("Bryan");
        PP.setApellido("Sandoval");
        PP.setVivienda("Jerusalen");
        PP.saludos();
        
        Caballo cl = new Caballo();
        cl.setNombre("Tiro al Blanco");
        cl.setColor("Blanco");
        cl.setEdad(15);
        cl.hola();
        
        Jarvis ja = new Jarvis();
        ja.setSaludo ("Jarvis");
        ja.setAmable("Sevir en lo que pueda");
        ja.setOrigen("Pelicula de Iron Man");
        ja.setCreado("Jarvis original ya que yo solo soy una idea de lo que puedo ser en la pelicula");
        ja.presentacion();
        
        
    }
    
}
