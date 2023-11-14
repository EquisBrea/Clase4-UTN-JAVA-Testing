package YouTubePopularity;

import YouTubePopularity.Canciones.Cancion;
import YouTubePopularity.Canciones.Album;
import YouTubePopularity.Canciones.Normal;

import java.time.Instant;
import java.time.Year;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int reproduccionesInicial = 0;
    public static int dislikesInicial = 0;
    public static int likesInicial = 0;
    public static int topeReproduccionesInicial = 1000;
    public static int topeReproduccionesEnAuge = 50000;
    public static int topeDislikesEnAuge = 5000;
    public static int topeLikesEnAuge = 20000;
    public static Long tiempoVueltaANormal = (long) 24L;
    public static Instant instanteDosDiasAtras = Instant.parse("2023-11-12T21:07:31.016343Z");
    public static Instant instanteUnDiaAtras = Instant.parse("2023-11-13T21:07:31.016343Z");
    public static void main(String[] args) {

       // cancioncita();
        theScientistReleases();
        theScientistReaches1001views();
        theScientistIsDislikedMoreThan5000Times();
        theScientistReaches50001ViewsAnd20001Likes();
        theScientistReaches50001ViewsAnd20001LikesButIsOld();
    }

    public static void cancioncita(){


        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");

        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setReproducciones(reproduccionesInicial);
        theScientist.setLikes(likesInicial);
        theScientist.setDislikes(dislikesInicial);
        theScientist.setAnioDeLanzamiento(Year.of(2022));
        Instant instante = Instant.parse("2023-11-12T21:07:31.016343Z");

        theScientist.setMomentoUltimaReproduccion(instante);

        theScientist.reproducir("1", theScientist);

        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());


        theScientist.setReproducciones(topeReproduccionesInicial + 1);
        instante = Instant.parse("2023-11-13T21:07:31.016343Z");
        theScientist.setMomentoUltimaReproduccion(instante);

        theScientist.reproducir("2", theScientist);

        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

        theScientist.setReproducciones(topeReproduccionesEnAuge + 1);

        theScientist.reproducir("3", theScientist);

        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

        theScientist.setReproducciones(topeReproduccionesInicial + 1);
        theScientist.setDislikes(topeDislikesEnAuge + 1);
        instante = Instant.parse("2023-11-12T21:07:31.016343Z");
        theScientist.setMomentoUltimaReproduccion(instante);

        theScientist.reproducir("4", theScientist );
        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());



        int reproduccionesTendencia =50200;
        theScientist.setReproducciones(reproduccionesTendencia);
        theScientist.setLikes(topeReproduccionesInicial);
    }
    private static void theScientistReleases(){
        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");

        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setReproducciones(reproduccionesInicial);
        theScientist.setLikes(likesInicial);
        theScientist.setDislikes(dislikesInicial);
        theScientist.setAnioDeLanzamiento(Year.of(2022));
        theScientist.setMomentoUltimaReproduccion(instanteDosDiasAtras);
        theScientist.setMomentoUltimaReproduccion(Instant.now());

        theScientist.reproducir("1", theScientist);

        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

    }
    private static void theScientistReaches1001views(){
        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");
        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setMomentoUltimaReproduccion(instanteUnDiaAtras);


        theScientist.setReproducciones(topeReproduccionesInicial + 1);

        theScientist.reproducir("2", theScientist);
        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

    }
    private static void theScientistIsDislikedMoreThan5000Times(){
        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");
        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setMomentoUltimaReproduccion(instanteUnDiaAtras);
        theScientist.setReproducciones(topeReproduccionesInicial + 1);
        theScientist.setDislikes(topeDislikesEnAuge + 1);

        theScientist.reproducir("3", theScientist);
        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

    }

    private static void theScientistReaches50001ViewsAnd20001Likes(){
        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");
        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setMomentoUltimaReproduccion(instanteUnDiaAtras);
        theScientist.setLikes(topeLikesEnAuge + 1 );

        theScientist.setReproducciones(topeReproduccionesEnAuge + 1);

        theScientist.reproducir("4", theScientist);
        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

    }

    private static void theScientistReaches50001ViewsAnd20001LikesButIsOld(){
        Cancion theScientist = new Cancion();
        theScientist.stateCancion = new Normal();
        Album aRushOfBloodToTheHead = new Album();

        aRushOfBloodToTheHead.setNameAlbum("A Rush of Blood to the head");
        theScientist.setNombreCancion("The Scientist");
        theScientist.setAlbum(aRushOfBloodToTheHead);
        theScientist.setArtista("Coldplay");
        theScientist.setLikes(topeLikesEnAuge + 1 );
        theScientist.setReproducciones(topeReproduccionesEnAuge + 1);
        theScientist.setMomentoUltimaReproduccion(instanteDosDiasAtras);

        theScientist.reproducir("1", theScientist);

        System.out.println(theScientist.getReproducciones() + " " +theScientist.getDislikes() + " " + theScientist.getTiempoDesdeUltimaReproduccion().toString());

    }
}