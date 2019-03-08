package lab7_eliasgiron;

import java.util.ArrayList;
import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private Date nacimiento;
    

    public Persona(String nombre, String apellido, String usuario, String contrasena, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
    }

    public Persona(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
