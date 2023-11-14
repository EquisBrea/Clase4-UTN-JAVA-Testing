package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Cancion;

import java.util.List;

public class AlbumTest {
    public List<YouTubePopularity.Canciones.Cancion> listaDeCanciones;
    public String nameAlbum;

    public List<YouTubePopularity.Canciones.Cancion> getListaDeCanciones() {
        return listaDeCanciones;
    }

    public void setListaDeCanciones(List<Cancion> listaDeCanciones) {
        this.listaDeCanciones = listaDeCanciones;
    }




    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }
}
