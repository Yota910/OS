import java.util.Enumeration;
import java.net.NetworkInterface;
import java.net.InetAddress;

public class os7_2 {
    public static void main(String[] args) {
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface intf = (NetworkInterface)interfaces.nextElement();
                System.out.println(intf.getName() + ":" + " No summary information");
                Enumeration addresses = intf.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress ip = (InetAddress)addresses.nextElement();
                    System.out.println("        " + "address " + ip.getHostAddress());
                }
                System.out.println("        " + "status: active");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
