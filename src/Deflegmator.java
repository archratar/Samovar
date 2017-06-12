/**
 * Created by arch on 6/5/17.
 */
public class Deflegmator {

    protected float destilatedValue;

    public float income (int inputOutput) {

        return process(inputOutput);
    }

    private float destilated (float inputOutput) {
        
        return destilatedValue = (inputOutput/(float)1.0002);
    }

    private float outcome (float inputOutput) {

        return inputOutput/(float)1.1*(float)3.023;
    }

    private float process (float inputOutput) {

        return this.outcome(this.destilated(inputOutput));
    }


}
