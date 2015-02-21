package google;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Ana on 2/21/2015.
 */
public class RunGoogle {
    public static void main(String[] args) {
        // Create Desktop object
        Desktop d= Desktop.getDesktop();
        try {
            // Browse a URL, say google.com
            d.browse(new URI("http://google.com"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}