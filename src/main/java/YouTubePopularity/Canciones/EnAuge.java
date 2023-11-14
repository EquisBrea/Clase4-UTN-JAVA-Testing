package YouTubePopularity.Canciones;

import YouTubePopularity.Icono;
import YouTubePopularity.Main;

public class EnAuge extends Cancion implements StateCancion {
    private String iconoString;

    {
        iconoString = Icono.ROCKET.texto();
    }




    @Override
    public void reproducir(String prefix, Cancion cancion) {
        if (esTendencia(cancion)) {
            cancion.setStateCancion(new EnTendencia());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else if (esNormal(cancion)) {
            cancion.setStateCancion(new Normal());
            cancion.stateCancion.reproducir(prefix, cancion);
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    private boolean esNormal(Cancion cancion) {
        return ((cancion.getReproducciones()<=1000)|| (cancion.dislikes) > 5000 || (cancion.getTiempoDesdeUltimaReproduccion() > 24));
    }
    private boolean esTendencia (Cancion cancion) {
        return ((cancion.getReproducciones() > Main.topeReproduccionesEnAuge) && (cancion.getLikes()> Main.topeLikesEnAuge) && cancion.getTiempoDesdeUltimaReproduccion()<24);
    }
    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }






}

