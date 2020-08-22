package uspg.edu;
public class ChistianEscobar {
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void presentacion () {
    System.out.println("Hola mi nombre es:" + getNombre());
    System.out.println("mi apellido es:" + getApellido());
    System.out.println("mi fecha de nacimiento es:" + getFecha_nacimiento());
    System.out.println("Me gusta escuchar musica y conocer nuevos lugares");
}
}
