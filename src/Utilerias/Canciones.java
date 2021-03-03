package Utilerias;

public class Canciones {
    String nombreCancion;
    String anioPublicacion;
    String colaboracion;
    public Artista miCancion;
    public Artista miColaboracion;
    public Artista miPlaylist;

    // CONSTRUCTOR DE LA CLASE CANCIONES
    public Canciones(String nombreCancion, String anioPublicacion, String colaboracion){
        this.nombreCancion = nombreCancion;
        this.anioPublicacion = anioPublicacion;
        this.colaboracion = colaboracion;
    }
}
