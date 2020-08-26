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
public class Jarvis {
    private String saludo;
    private String amable;
    private String origen;
    private String creado;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getAmable() {
        return amable;
    }

    public void setAmable(String amable) {
        this.amable = amable;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }
    public void presentacion() {
        System.out.println("Hola me llamo: "+ getSaludo ());
        System.out.println("Estoy aqui para: "+ getAmable ());
        System.out.println("Mi origen es de la: "+getOrigen ());
        System.out.println("Soy una vercion inferior a: "+ getCreado ());
    }
    
}
