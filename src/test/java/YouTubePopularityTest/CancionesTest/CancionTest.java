package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Album;
import YouTubePopularity.Canciones.StateCancion;
import YouTubePopularity.Icono;

import java.time.Duration;
import java.time.Instant;
import java.time.Year;

public class CancionTest {
    public YouTubePopularity.Canciones.StateCancion stateCancion;
    protected int reproducciones;
    protected int likes;
    protected int dislikes;
    protected Instant momentoUltimaReproduccion;
    protected YouTubePopularity.Canciones.Album album;
    protected Year anioDeLanzamiento;
    protected String artista;
    protected String nombreCancion;




    public Icono getIcono() {
        return null;
    }

    public void reproducir(String prefix, YouTubePopularity.Canciones.Cancion cancion) {
        this.stateCancion.reproducir(prefix, cancion);
    }

    public YouTubePopularity.Canciones.StateCancion getStateCancion() {
        return stateCancion;
    }

    public void setStateCancion(StateCancion stateCancion) {
        this.stateCancion = stateCancion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public Instant getMomentoUltimaReproduccion() {
        return momentoUltimaReproduccion;
    }

    public void setMomentoUltimaReproduccion(Instant momentoUltimaReproduccion) {
        this.momentoUltimaReproduccion = momentoUltimaReproduccion;
    }
    public Long getTiempoDesdeUltimaReproduccion() {
        return Duration.between(getMomentoUltimaReproduccion(), Instant.now()).toHours();
    }

    public YouTubePopularity.Canciones.Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Year getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setAnioDeLanzamiento(Year anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }


}
