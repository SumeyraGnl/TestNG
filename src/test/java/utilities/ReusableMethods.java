package utilities;

import com.beust.ah.A;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {

    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {

        }
    }

}
