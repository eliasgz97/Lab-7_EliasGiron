package lab7_eliasgiron;

import java.util.Date;
import java.util.ArrayList;

public class Usuario extends Persona {

    //Tendrán Nombre, Apellido, Usuario, Contraseña, Fecha de Nacimiento, Lista de Canciones, Playlists y Lista de Artistas que sigue.
    private ArrayList<Playlist> playlists = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();
    private ArrayList<Cancion> canciones = new ArrayList();

    public Usuario(String nombre, String apellido, String usuario, String contrasena, Date nacimiento) {
        super(nombre, apellido, usuario, contrasena, nacimiento);
    }

    public Usuario(String usuario, String contrasena) {
        super(usuario, contrasena);
    }
    
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return super.getUsuario();
    }

}
