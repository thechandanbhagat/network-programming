import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://chandanbhagat.com.np/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            System.out.println(urlConnection.getContentLength());
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    
}
