package Chapter3;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ContentGetter {
    public static void main(String[] args) throws MalformedURLException {
        URL u=new URL("https://www.ascii-code.com/i/ascii-code.jpg");
        try {
            Object o=u.getContent();
            if(o instanceof InputStream) {
                InputStream in=(InputStream)o;
                int c;
                while((c=in.read())!=-1) System.out.print(Character.toChars(c));
                in.close();
            }
            else    {

                System.out.println(o.getClass().getName());
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
