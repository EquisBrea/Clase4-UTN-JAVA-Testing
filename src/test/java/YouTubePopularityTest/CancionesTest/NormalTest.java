package YouTubePopularityTest.CancionesTest;

import YouTubePopularity.Canciones.Cancion;
import YouTubePopularity.Canciones.EnAuge;
import YouTubePopularity.Canciones.StateCancion;
import YouTubePopularity.Icono;

public class NormalTest implements StateCancion {
    private final String iconoString;

    {
        iconoString = Icono.MUSICAL_NOTE.texto();
    }





    @Override
    public void  reproducir(String prefix, YouTubePopularity.Canciones.Cancion cancion) {
        if (estaEnAuge(cancion)) {
            cancion.setStateCancion(new EnAuge());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }
    @Override
    public void cambiarStateCancion(YouTubePopularity.Canciones.Cancion cancion) {

    }

    public NormalTest() {
    }

    private boolean estaEnAuge(Cancion cancion){
        return ((cancion.getReproducciones()>1000)&&(cancion.getTiempoDesdeUltimaReproduccion()<24) && (cancion.getDislikes() <5000));
    }
}

