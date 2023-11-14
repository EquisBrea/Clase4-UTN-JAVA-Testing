package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Cancion;

public interface StateCancionTest {


    public void reproducir(String prefix, YouTubePopularity.Canciones.Cancion cancion);

    public void cambiarStateCancion(Cancion cancion);

}
