/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author Maria
 */
public class Aicerinor {
    private String Nombre;
    private String Apellido;
    private String Fecha_nacimiento;
    
    //Getters and setters 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }
    
    public void datos(){
        System.out.println("Hola a todos");
        System.out.println("Yo soy:" + getNombre() + getApellido());
        System.out.println("Mi fecha de nacimiento es:" + getFecha_nacimiento());
    }
}
