/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 * Esta es una practica para el parcial
 * @author Bryan Sandoval
 */
public class PracticaParcialBRSC {
    private String nombre;
    private String apellido;
    private String Vivienda;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getVivienda() {
        return Vivienda;
    }

    public void setVivienda(String Vivienda) {
        this.Vivienda = Vivienda;
    }   
   
    public void saludos (){
        System.out.println("Mi nimbre es: "+ getNombre () + "Mi apellido es: "+ getApellido ());
        System.out.println("Vivo en :" + getVivienda ());
    }
}
