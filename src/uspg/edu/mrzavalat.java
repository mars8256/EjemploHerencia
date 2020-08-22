/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu;

/**
 *
 * @author marit
 */
public class mrzavalat {
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    

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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void saludo(){
        System.out.println("Hola saludos a todos soy: " + getNombre() +getApellido()+"/" + 
                " Mi cumpleaños es el: "+getFecha_nacimiento()+ "/" + " Van a ver que valos a lograr salir adelante");
        System.out.println("Me gustan los deportes, pero mis favoritos son la natación, baloncesto y el fútbol");
    }
}
