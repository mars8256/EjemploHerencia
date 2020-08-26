/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Bryan Sandoval
 */
public class Caballo {
    private String Nombre;
    private String color;
    private int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void hola () {
        System.out.println("El nombre es: "+ getNombre ());
        System.out.println("El color es: "+ getColor() );
        System.out.println("Tiene: "+ getEdad () );
    }
    
}
