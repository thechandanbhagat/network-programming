package Chapter3;

import java.net.URI;
import java.net.URISyntaxException;

public class URLTest {
    public static void main(String[] args) {
        try{

            URI u = new URI(null, "www.google.com", "/", null);
        }
        catch (URISyntaxException ex){
            System.out.println(ex.toString());
        }
    }
}
