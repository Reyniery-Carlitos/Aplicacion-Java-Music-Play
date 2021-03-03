package Utilerias;
import java.util.ArrayList;

public class Cliente {
    String nombreCliente;
    ArrayList<Artista> cCanciones = new ArrayList<Artista>();

    // CONSTRUCTOR DE LA CLASE CLIENTE
    public Cliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
        this.cCanciones = new ArrayList<Artista>();
    }

    // Asignar canciones
	public void Asignar_cancionesC(Artista nueva_cancionC) {
	    nueva_cancionC.cCanciones = this;
	    this.cCanciones.add(nueva_cancionC);
	}

    // Mostrar Canciones
    public void Mostrar_cancionesC(){
        System.out.println("****** INFORMACION DE LOS CLIENTES ******");
        System.out.println("---------------------------------------");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("***** SUSCRITO A LOS ALBUMES ***** ");
        for(Artista c : this.cCanciones){
            String nombreAlbum = c.nombreAlbum;
            String fechaPublicacion = c.fechaPublicacionAlbum;
            c.Mostrar_playlist(nombreAlbum, fechaPublicacion);
        }
    }
}
