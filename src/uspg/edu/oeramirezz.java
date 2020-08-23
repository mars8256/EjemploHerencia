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
public class oeramirezz {
      private String nombre;
    private String apellido;
    private String edad;

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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String fecha_nacimiento) {
        this.edad = fecha_nacimiento;
    }
    
    
    public void Saludo(){
        System.out.println("Hola a todos soy"+""+""+getNombre()+getApellido()+"tengo"+getEdad());
    }
            
}
