package Chapter2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReverseTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("104.21.79.8");
        System.out.println("Host : " + ip.getCanonicalHostName());
    }
}
