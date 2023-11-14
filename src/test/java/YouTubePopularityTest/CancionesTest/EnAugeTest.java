package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Cancion;
import YouTubePopularity.Canciones.EnTendencia;
import YouTubePopularity.Canciones.StateCancion;
import YouTubePopularity.Icono;

public class EnAugeTest extends YouTubePopularity.Canciones.Cancion implements StateCancion {
    private String iconoString;

    {
        iconoString = Icono.ROCKET.texto();
    }




    @Override
    public void reproducir(String prefix, YouTubePopularity.Canciones.Cancion cancion) {
        if (esTendencia(cancion)) {
            cancion.setStateCancion(new EnTendencia());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    @Override
    public void cambiarStateCancion(YouTubePopularity.Canciones.Cancion cancion) {

    }

    private boolean esTendencia (Cancion cancion) {
        return ((cancion.getReproducciones() > 49000) && (cancion.getDislikes() < 5000));
    }




}

