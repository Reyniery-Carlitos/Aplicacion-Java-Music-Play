package Utilerias;
import java.util.ArrayList;

public class Artista {
    String nombreArtista;
    String generoMusical;
    public String nombreAlbum;
    public String fechaPublicacionAlbum;
    ArrayList<Canciones> canciones;
    ArrayList<Canciones> album;
    ArrayList<Canciones> colaboraciones = new ArrayList<Canciones>();
    public Cliente cCanciones;

    // CONSTRUCTOR DE LA CLASE ARTISTA.
    public Artista(String nombreArtista, String generoMusical){
        this.nombreArtista = nombreArtista;
        this.generoMusical = generoMusical;
        this.canciones = new ArrayList<Canciones>();
        this.album = new ArrayList<Canciones>();
        this.colaboraciones = new ArrayList<Canciones>();
    }

    // Aignar canciones a los artistas
	public void Asignar_canciones(Canciones nueva_Cancion) {
	    nueva_Cancion.miCancion = this;
	    this.canciones.add(nueva_Cancion);
	}

    // Mostrar listado de canciones de los artistas.
    public void Mostrar_canciones() {
        System.out.println("---------------------------------------");
        for(Canciones c : this.canciones){
            System.out.println("Nombre del artista = " + nombreArtista + ", Nombre de la cancion= " + c.nombreCancion);
        }
    }

    // Asignar colaboracion
    public void Asignar_colaboracion(Canciones nueva_colaboracion){
        nueva_colaboracion.miColaboracion = this;
        this.colaboraciones.add(nueva_colaboracion);
    }

    // Mostrar colaboracion
    public void Mostrar_colaboracion(){
        System.out.println("---------------------------------------");
        for(Canciones c : this.colaboraciones){
            System.out.println("Nombre del artista = " + nombreArtista + ", Nombre de la cancion= " + c.nombreCancion + " Colaboracion con: " + c.colaboracion);
        }
    }

    // Crear playlist
	public void Asignar_playlist(Canciones nuevo_album) {
	    nuevo_album.miPlaylist = this;
	    this.album.add(nuevo_album);
	}

    // Mostrar playlist
    public void Mostrar_playlist(String nombreAlbum, String fechaPublicacionAlbum) {
        System.out.println("---------------------------------------");
        System.out.println("Nombre del artista: " + nombreArtista);
        System.out.println("NOMBRE DEL ALBUM: " + nombreAlbum + " Publicado en: " + fechaPublicacionAlbum);
        System.out.println("***** CANCIONES DEL ALBUM *****");

        for(Canciones c : this.album){            
            System.out.println("Nombre de la cancion= " + c.nombreCancion);
        }
    }
}