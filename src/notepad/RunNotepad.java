package notepad;
import java.io.IOException;

/**
 * Created by Dan on 2/8/2015.
 */
public class RunNotepad {
    public static void main(String[] args) {
        Runtime np = Runtime.getRuntime();
        int x = 1;

        for (x = 1; x < 20; x++) {
            try {
                np.exec("notepad");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
