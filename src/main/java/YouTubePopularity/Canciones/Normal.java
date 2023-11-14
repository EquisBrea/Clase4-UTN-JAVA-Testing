package YouTubePopularity.Canciones;

import YouTubePopularity.Icono;
import YouTubePopularity.Main;

public class Normal implements StateCancion {
    private final String iconoString;

    {
        iconoString = Icono.MUSICAL_NOTE.texto();
    }




    @Override
    public void  reproducir(String prefix, Cancion cancion) {
        if (estaEnAuge(cancion)) {
            cancion.setStateCancion(new EnAuge());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else if (esTendencia(cancion)) {
            cancion.setStateCancion(new EnTendencia());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    private boolean estaEnAuge(Cancion cancion){
        return ((cancion.getReproducciones() > 1000 && cancion.getReproducciones()<= Main.topeReproduccionesEnAuge) && (cancion.getDislikes() <= Main.topeDislikesEnAuge) && (cancion.getTiempoDesdeUltimaReproduccion() < 24) );
    }
    private boolean esTendencia (Cancion cancion) {
        return ((cancion.getReproducciones() > Main.topeReproduccionesEnAuge) && (cancion.getLikes()> Main.topeLikesEnAuge) && cancion.getTiempoDesdeUltimaReproduccion()<24);
    }

    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }

    public Normal() {
    }


}

