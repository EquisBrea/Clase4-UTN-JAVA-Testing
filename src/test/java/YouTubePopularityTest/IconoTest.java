package YouTubePopularityTest;

public class IconoTest {
    public static YouTubePopularity.Icono MUSICAL_NOTE = new YouTubePopularity.Icono(new int[]{0xD83C, 0xDFB5});
    public static YouTubePopularity.Icono ROCKET = new YouTubePopularity.Icono(new int[]{0xD83D, 0xDE80});
    public static YouTubePopularity.Icono FIRE = new YouTubePopularity.Icono(new int[]{0xD83D, 0xDD25});
    private int[] internalEncoding;

    public IconoTest(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}