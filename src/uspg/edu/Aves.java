/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Otto
 */
public class Aves extends Animal {
    private String especie;

    public Aves(String nombre, String tipo_alimentacion, int edad, String especie) {
        super(nombre, tipo_alimentacion, edad);
        this.especie=especie;
    }

    public Aves() {
    }
   

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void datos(){
        System.out.println(getNombre()+"-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getEspecie());
        
    }
    
    
   
}
