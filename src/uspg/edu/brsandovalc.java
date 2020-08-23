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
public class brsandovalc {
    private String nombre;
    private String comida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    public void saludo(){
        System.out.println("Mi nombre es: " +getNombre () + ", si logre realizar el jercicio");
        System.out.println("Mi comida favorita es: " +getComida());
       
    }
}
