package lab7_eliasgiron;

public class Cancion {
    private String nombre;
    private int duracion;
    private String artista;

    public Cancion(String nombre, int duracion, String artista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getduracion() {
        return duracion;
    }

    public void setduracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return nombre + " - "+artista;
    }
    
    
}
