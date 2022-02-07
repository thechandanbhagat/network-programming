package Chapter3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ReadDataFromURL{
    public static void main(String[] args) {
        try {
            URL u = new URL("https://chandanbhagat.com.np");
            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) System.out.println(c);
            in.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}