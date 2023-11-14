package YouTubePopularity.Canciones;

import YouTubePopularity.Icono;
import YouTubePopularity.Main;

public class EnTendencia extends Cancion implements StateCancion {
    private String iconoString;

    {
        iconoString = Icono.FIRE.texto();
    }



    @Override
    public void reproducir(String prefix, Cancion cancion) {
        if (estaEnAuge(cancion)) {
            cancion.setStateCancion(new EnAuge());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else if (esNormal(cancion)) {
            cancion.setStateCancion(new Normal());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    private boolean esNormal(Cancion cancion) {
        return ((cancion.getReproducciones()<=1000)|| cancion.dislikes>5000||cancion.getTiempoDesdeUltimaReproduccion()>24);
    }
    private boolean estaEnAuge(Cancion cancion){
        return ((cancion.getReproducciones() > 1000 && cancion.getReproducciones()<= Main.topeReproduccionesEnAuge) && (cancion.getDislikes() <= Main.topeDislikesEnAuge) && (cancion.getTiempoDesdeUltimaReproduccion() < 24) );
    }
    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }
}
