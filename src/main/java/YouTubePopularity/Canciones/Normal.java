package YouTubePopularity.Canciones;

import YouTubePopularity.Icono;

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
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }
    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }

    public Normal() {
    }

    private boolean estaEnAuge(Cancion cancion){
        return ((cancion.getReproducciones()>1000)&&(cancion.getTiempoDesdeUltimaReproduccion()<24) && (cancion.dislikes<5000));
    }
}

