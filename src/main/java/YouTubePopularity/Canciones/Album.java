package YouTubePopularity.Canciones;

import java.util.List;

public class Album {
    public List<Cancion> listaDeCanciones;
    public String nameAlbum;

    public List<Cancion> getListaDeCanciones() {
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
