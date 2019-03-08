package lab7_eliasgiron;

import java.util.ArrayList;
import java.util.Date;

public class Artista extends Persona {

    private ArrayList <Usuario> seguidores = new ArrayList();
    private ArrayList <Album> albums = new ArrayList();
    private ArrayList<Cancion> cancionespropias = new ArrayList();
    
    public Artista(String nombre, String apellido, String usuario, String contrasena, Date nacimiento) {
        super(nombre, apellido, usuario, contrasena, nacimiento);
    }
    //Tendrán Nombre, Apellido, Usuario, Contraseña, Fecha de Nacimiento, Lista de Canciones Propias, Lista de Seguidores y Álbumes.

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Cancion> getCancionespropias() {
        return cancionespropias;
    }

    public void setCancionespropias(ArrayList<Cancion> cancionespropias) {
        this.cancionespropias = cancionespropias;
    }

    @Override
    public String toString() {
        return super.getUsuario();
    }
    
    
}
