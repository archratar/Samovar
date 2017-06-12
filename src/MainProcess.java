import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by arch on 6/5/17.
 */
public class MainProcess {
    public static void main (String [] args) {

        Samogon samogon = new Samogon();

        int litrazh = 0;

        // boxing - unboxing
        HashMap
        int isOk;
        System.out.println("Input some braga");
        do {
            try {
                isOk = 0;
                litrazh = System.in.read();
            } catch (IOException e) {
                System.out.println("User Invalid123");
                e.printStackTrace();
                isOk = 1;
            }
        } while (isOk == 1);


        System.out.println(samogon.bidonForBraga.fillMe(litrazh));
        System.out.println(samogon.deflegmator.income(2));


    }

}
