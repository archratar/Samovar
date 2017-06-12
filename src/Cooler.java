/**
 * Created by arch on 6/5/17.
 */
public class Cooler {

    Buhlo buhlo = new Buhlo();

    public float income (float incom) {

        buhlo.setQuality(+5);
        return outcome (incom);
    }

    private float outcome (float outcome) {

        return buhlo.getQuality() > 10 ? outcome/(float)1.2: outcome/(float)1.0;
    }
}
