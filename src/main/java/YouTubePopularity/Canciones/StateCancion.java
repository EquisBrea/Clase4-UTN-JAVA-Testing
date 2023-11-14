package YouTubePopularity.Canciones;

public interface StateCancion {


    public void reproducir(String prefix, Cancion cancion);

    public void cambiarStateCancion(Cancion cancion);

}
