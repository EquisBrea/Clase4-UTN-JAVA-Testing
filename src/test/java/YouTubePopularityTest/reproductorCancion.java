package YouTubePopularityTest;

import YouTubePopularity.Icono;

public interface reproductorCancion {
    public Icono icono();

    public Long tiempoDesdeFechaUltimaReprouccion();
    public void reproducir();

}
