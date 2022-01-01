package Chapter2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ReverseTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("XXX.XXX.XXX.XXX");
        System.out.println("Host : " + ip.getCanonicalHostName());
    }
}
