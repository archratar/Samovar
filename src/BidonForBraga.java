/**
 * Created by arch on 6/5/17.
 */
public class BidonForBraga {

    private static int availableLitrazh = 38;
    private boolean areYouMadBro;

    public int fillMe (int litrazh) {

        this.areYouMadBro = isLitrazhValid(litrazh) ? false: true;
        return !areYouMadBro ? availableLitrazh: litrazh - availableLitrazh;
    }

    private static boolean isLitrazhValid (int litrazh) {

        return litrazh > availableLitrazh ? false: true;
    }
}
