/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author morozco
 */
public class Perro extends Animal{
    private String raza;

    public Perro(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
    
    public Perro(){
        //super();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    public void mostrar(){
        System.out.println(getNombre() + "-" + 
                getTipo_alimentacion() + "-" +
                getEdad() + "-" +
                getRaza());
    }
    
}
