import Utilerias.*;

public class App {
    public static void main(String[] args){
        // CREACION DE LOS ARTISTAS
        Artista a1 = new Artista("Romeo Santos", "Bachata");
        Artista a2 = new Artista("Sebastian Yatra", "Reggaeton");
        Artista a3 = new Artista("Mana", "Rock");
        Artista a4 = new Artista("Vicente Fernandez", "Ranchera");
        Artista a5 = new Artista("Banda MS", "Banda");
        Artista a6 = new Artista ("Leo Dan", "Variado");
        Artista a7 = new Artista("Bryan Adams", "Pop Rock");

        // CREACION DE LOS CLIENTES
        Cliente c1 = new Cliente("Josue Ramirez");
        Cliente c2 = new Cliente("Aaron Guitierrez");
        Cliente c3 = new Cliente("Elisa Gomez");
        Cliente c4 = new Cliente("Alberto Martinez");
        Cliente c5 = new Cliente("Blanca Chinchilla");

        // CREACION DE LAS CANCIONES
        Canciones ba1 = new Canciones("Propuesta Indecente","2014", " ");
        Canciones ba2 = new Canciones("Sobredosis", "2017", " ");
        Canciones ba3 = new Canciones("Amor de madre", "2002", " ");
        Canciones ba4 = new Canciones("Cancoincitas de amor", "2014", " ");
        Canciones ba5 = new Canciones("Eres mia", "2014", " ");
        Canciones ba6 = new Canciones("Imitadora", "2017", " ");
        Canciones ba7 = new Canciones("Dile al amor", "2009", " ");
        Canciones ba8 = new Canciones("Ella y yo", "2005", " ");
        Canciones ba9 = new Canciones("Magia negra", "2011", "Formula");
        Canciones ba10 = new Canciones("Immortal", "2019", " ");

        Canciones re1 = new Canciones("Un anio", "2020", "Reik");
        Canciones re2 = new Canciones("Traicionera", "2017", " ");
        Canciones re3 = new Canciones("No hay nadie mas", "2018", " ");
        Canciones re4 = new Canciones("Robarte un beso", "2018", "Carlos Vives");
        Canciones re5 = new Canciones("Devuelveme el corazon", "2018", " ");
        Canciones re6 = new Canciones("Ya no tiene novio", "2019", "Mau y Ricky");
        Canciones re7 = new Canciones("Cristina", "2019", "Cristina");
        Canciones re8 = new Canciones("Como mirarte", "2017", " ");
        Canciones re9 = new Canciones("Falta amor", "2020", "Ricky Martin");
        Canciones re10 = new Canciones("A Donde van", "2020", "Alvaro Diaz");

        Canciones rk1 = new Canciones("En el muelle de San Blas", "1997", " ");
        Canciones rk2 = new Canciones("Rayando el sol", "1990", "Pablo Alboran");
        Canciones rk3 = new Canciones("Labios Compartidos", "2006", " ");
        Canciones rk4 = new Canciones("Amor clandestino", "2011", " ");
        Canciones rk5 = new Canciones("El verdadero amor perdona", "2011", " ");
        Canciones rk6 = new Canciones("Me vale", "1992", " ");
        Canciones rk7 = new Canciones("Si no te hubieras ido", "2008", " ");
        Canciones rk8 = new Canciones("Como te deseo", "1992", " ");
        Canciones rk9 = new Canciones("Hasta que te conoci", "2012", " ");
        Canciones rk10 = new Canciones("De pies a cabeza", "2016", "Nicky Jam");

        Canciones rh1 = new Canciones("La ley del monte", "1990", " ");
        Canciones rh2 = new Canciones("Por tu maldito amor", "1989", " ");
        Canciones rh3 = new Canciones("Estos celos", "2007", " ");
        Canciones rh4 = new Canciones("Aca entre nos", "1990", " ");
        Canciones rh5 = new Canciones("Un millon de primaveras", "2016", " ");
        Canciones rh6 = new Canciones("Con la misma tijera", "1972", " ");
        Canciones rh7 = new Canciones("El hijo del pueblo", "1991", " ");
        Canciones rh8 = new Canciones("Ya me voy para siempre", "1979", " ");
        Canciones rh9 = new Canciones("Hasta que te conoci", "1998", " ");
        Canciones rh10 = new Canciones("Me voy a quitar de en medio", "1998", "Nicky Jam");

        Canciones b1 = new Canciones("Mi razon de ser", "2018", "Carlos Rivera");
        Canciones b2 = new Canciones("Hablame de ti", "2019", " ");
        Canciones b3 = new Canciones("No me pidas perdon", "2014", " ");
        Canciones b4 = new Canciones("Solo con verte", "2016", " ");
        Canciones b5 = new Canciones("Lo mejor que me paso", "2020", "Carlos Rivera");
        Canciones b6 = new Canciones("Gracias por eso", "2020", " ");
        Canciones b7 = new Canciones("Me vas a extraniar", "2016", " ");
        Canciones b8 = new Canciones("Ayer la vi por la calle", "2006", " ");
        Canciones b9 = new Canciones("Que maldicion", "2020", "Snoop Dog");
        Canciones b10 = new Canciones("No elegi conocerte", "2018", " ");

        Canciones v1 = new Canciones("Pideme la luna", "2006", "Salvador Lizarra");
        Canciones v2 = new Canciones("Como te extranio mi amor", "1987", "Ruben Albarran");
        Canciones v3 = new Canciones("La ninia esta triste", "2006", " ");
        Canciones v4 = new Canciones("Por un caminito", "1987", " Grupo caniaveral de Humberto Pabon");
        Canciones v5 = new Canciones("Pero Raquel", "1987", " ");
        Canciones v6 = new Canciones("El amor estuvo aqui", "2006", " ");
        Canciones v7 = new Canciones("El amor y la felicidad", "1996", " ");
        Canciones v8 = new Canciones("Fanny", "1963", "Kinky");
        Canciones v9 = new Canciones("Te he prometido", "2006", "Ricardo Montaner");
        Canciones v10 = new Canciones("Esa pared", "1963", "Vicente Fernandez");

        Canciones pr1 = new Canciones("Everything I do", "1997", " ");
        Canciones pr2 = new Canciones("Please Forgive me", "1993", " ");
        Canciones pr3 = new Canciones("Heaven", "1984", " ");
        Canciones pr4 = new Canciones("Summer of'69", "1984", " ");
        Canciones pr5 = new Canciones("Run to you", "1984", " ");
        Canciones pr6 = new Canciones("Stright from the heart", "1983", " ");
        Canciones pr7 = new Canciones("It's only love", "1984", "Reckless");
        Canciones pr8 = new Canciones("All for love", "1984", "The three musketeers");
        Canciones pr9 = new Canciones("That's how strong our love", "2019", "Shine a Light");

        // CREAR ALBUMES
        // Album al1 = new Album("Utopia", "2019");

        // ASIGNAR LAS CANCIONES A LOS ARTISTAS
        a1.Asignar_canciones(ba1);
        a1.Asignar_canciones(ba2);
        a1.Asignar_canciones(ba3);
        a1.Asignar_canciones(ba4);
        a1.Asignar_canciones(ba5);
        a1.Asignar_canciones(ba6);
        a1.Asignar_canciones(ba7);
        a1.Asignar_canciones(ba8);
        a1.Asignar_canciones(ba10);

        a2.Asignar_canciones(re2);
        a2.Asignar_canciones(re3);
        a2.Asignar_canciones(re5);
        a2.Asignar_canciones(re8);

        a3.Asignar_canciones(rk1);
        a3.Asignar_canciones(rk3);
        a3.Asignar_canciones(rk4);
        a3.Asignar_canciones(rk5);
        a3.Asignar_canciones(rk6);
        a3.Asignar_canciones(rk7);
        a3.Asignar_canciones(rk8);
        a3.Asignar_canciones(rk9);

        a4.Asignar_canciones(rh1);
        a4.Asignar_canciones(rh2);
        a4.Asignar_canciones(rh3);
        a4.Asignar_canciones(rh4);
        a4.Asignar_canciones(rh5);
        a4.Asignar_canciones(rh6);
        a4.Asignar_canciones(rh7);
        a4.Asignar_canciones(rh8);
        a4.Asignar_canciones(rh9);

        a5.Asignar_canciones(b2);
        a5.Asignar_canciones(b3);
        a5.Asignar_canciones(b4);
        a5.Asignar_canciones(b6);
        a5.Asignar_canciones(b7);
        a5.Asignar_canciones(b8);
        a5.Asignar_canciones(b10);

        a6.Asignar_canciones(v3);
        a6.Asignar_canciones(v5);
        a6.Asignar_canciones(v6);
        a6.Asignar_canciones(v7);
        a6.Asignar_canciones(v8);

        a7.Asignar_canciones(pr1);
        a7.Asignar_canciones(pr2);
        a7.Asignar_canciones(pr3);
        a7.Asignar_canciones(pr4);
        a7.Asignar_canciones(pr5);
        a7.Asignar_canciones(pr6);

        // Asignar canciones en colaboracion
        a1.Asignar_colaboracion(ba9);

        a2.Asignar_colaboracion(re1);
        a2.Asignar_colaboracion(re4);
        a2.Asignar_colaboracion(re6);
        a2.Asignar_colaboracion(re7);
        a2.Asignar_colaboracion(re9);
        a2.Asignar_colaboracion(re10);

        a3.Asignar_colaboracion(rk2);
        a3.Asignar_colaboracion(rk10);

        a4.Asignar_colaboracion(rh10);

        a5.Asignar_colaboracion(b1);
        a5.Asignar_colaboracion(b5);
        a5.Asignar_colaboracion(b9);

        a6.Asignar_colaboracion(v1);
        a6.Asignar_colaboracion(v2);
        a6.Asignar_colaboracion(v4);
        a6.Asignar_colaboracion(v9);
        a6.Asignar_colaboracion(v10);

        a7.Asignar_colaboracion(pr7);
        a7.Asignar_colaboracion(pr8);
        a7.Asignar_colaboracion(pr9);

        // MOSTRAR CANCIONES CON SUS ARTISTAS
        System.out.println("-----------------------------------------------------------");
        System.out.println("*****LISTADO DE CANCIONES INDIVIDUALES DE LOS ARTISTAS*****");
        a1.Mostrar_canciones();
        a2.Mostrar_canciones();
        a3.Mostrar_canciones();
        a4.Mostrar_canciones();
        a5.Mostrar_canciones();
        a6.Mostrar_canciones();
        a7.Mostrar_canciones();

        // Mostrar Colaboraciones
        System.out.println("--------------------------------------------------------------");
        System.out.println("*****LISTADO DE CANCIONES EN COLABORACION DE LOS ARTISTAS*****");
        a1.Mostrar_colaboracion();
        a2.Mostrar_colaboracion();
        a3.Mostrar_colaboracion();
        a4.Mostrar_colaboracion();
        a5.Mostrar_colaboracion();
        a6.Mostrar_colaboracion();
        a7.Mostrar_colaboracion();

        // CREAR ALBUM DE CANCIONES
        a1.Asignar_playlist(ba1);
        a1.Asignar_playlist(ba6);
        a1.Asignar_playlist(ba7);
        a1.Asignar_playlist(ba10);
        a1.Asignar_playlist(ba9);
        a1.Asignar_playlist(ba2);

        a2.Asignar_playlist(re4);
        a2.Asignar_playlist(re7);
        a2.Asignar_playlist(re3);
        a2.Asignar_playlist(re2);
        a2.Asignar_playlist(re9);

        a3.Asignar_playlist(rk5);
        a3.Asignar_playlist(rk3);
        a3.Asignar_playlist(rk6);
        a3.Asignar_playlist(rk2);
        a3.Asignar_playlist(rk10);

        a4.Asignar_playlist(rh10);
        a4.Asignar_playlist(rh8);
        a4.Asignar_playlist(rh6);
        a4.Asignar_playlist(rh1);

        a5.Asignar_playlist(b6);
        a5.Asignar_playlist(b7);
        a5.Asignar_playlist(b1);
        a5.Asignar_playlist(b2);
        a5.Asignar_playlist(b9);

        a6.Asignar_playlist(v2);
        a6.Asignar_playlist(v4);
        a6.Asignar_playlist(v5);
        a6.Asignar_playlist(v3);
        a6.Asignar_playlist(v6);
        a6.Asignar_playlist(v10);

        a7.Asignar_playlist(pr1);
        a7.Asignar_playlist(pr3);
        a7.Asignar_playlist(pr9);

        // MOSTRAR ALBUMES
        System.out.println("***** LISTADO DE LOS ALBUMES DE LOS ARTISTAS *****");
        a1.Mostrar_playlist("Utopia", "2019");
        a2.Mostrar_playlist("Fantasia", "2020");
        a3.Mostrar_playlist("Cama encendida", "2018");
        a4.Mostrar_playlist("Milenio", "2015");
        a5.Mostrar_playlist("El trabajo es la suerte", "2013");
        a6.Mostrar_playlist("Celebrando a una leyenda", "2018");
        a7.Mostrar_playlist("Waking up the neighbours", "2019");

        // ASIGNAR CANCIONES A LOS CLIENTES
        c1.Asignar_cancionesC(a1);
        c1.Asignar_cancionesC(a5);
        c1.Asignar_cancionesC(a7);

        c2.Asignar_cancionesC(a3);
        c2.Asignar_cancionesC(a6);

        c3.Asignar_cancionesC(a1);
        c3.Asignar_cancionesC(a2);
        c3.Asignar_cancionesC(a4);

        c4.Asignar_cancionesC(a4);
        c4.Asignar_cancionesC(a7);
        c4.Asignar_cancionesC(a3);

        c5.Asignar_cancionesC(a5);
        c5.Asignar_cancionesC(a2);

        // MOSTRAR SUSCRIPCIONES DE LOS CLIENTES
        System.out.println("***** MOSTRAR LISTA DE ALBUMES SUSCRITOS DE LOS CLIENTES *****");
        c1.Mostrar_cancionesC();
        c2.Mostrar_cancionesC();
        c3.Mostrar_cancionesC();
        c4.Mostrar_cancionesC();
        c5.Mostrar_cancionesC();
    }
}
