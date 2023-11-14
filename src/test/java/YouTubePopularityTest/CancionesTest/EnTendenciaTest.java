package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Cancion;
import YouTubePopularity.Canciones.Normal;
import YouTubePopularity.Canciones.StateCancion;
import YouTubePopularity.Icono;

public class EnTendenciaTest extends YouTubePopularity.Canciones.Cancion implements StateCancion {
    private String iconoString;

    {
        iconoString = Icono.FIRE.texto();
    }



    @Override
    public void reproducir(String prefix, YouTubePopularity.Canciones.Cancion cancion) {
        if (noEsTendencia(cancion)) {
            cancion.setStateCancion(new Normal());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    private boolean noEsTendencia(YouTubePopularity.Canciones.Cancion cancion) {
        return (cancion.getDislikes() > 5000 || cancion.getTiempoDesdeUltimaReproduccion()>24);
    }

    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }
}
