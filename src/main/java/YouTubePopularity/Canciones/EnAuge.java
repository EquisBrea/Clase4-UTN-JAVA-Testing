package YouTubePopularity.Canciones;

import YouTubePopularity.Icono;

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
        } else {
            System.out.println(prefix + this.iconoString + " " + cancion.getArtista() + " " + cancion.getAlbum().getNameAlbum() + " " + cancion.getNombreCancion());
        }
    }

    @Override
    public void cambiarStateCancion(Cancion cancion) {

    }

    private boolean esTendencia (Cancion cancion) {
        return ((cancion.reproducciones > 49000) && (cancion.dislikes < 5000));
    }




}

