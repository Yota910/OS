import java.net.*;
public class multi_reception {
    public static void main(String[] args) throws Exception {
		byte[] bit = new byte[256];
		int port = 8888;
		InetAddress address = InetAddress.getByName("228.5.6.7");
		InetSocketAddress group = new InetSocketAddress(address, port);
		NetworkInterface intf = NetworkInterface.getByName("bge0");
		MulticastSocket socket = new MulticastSocket(port);
		socket.joinGroup(group, intf);
		DatagramPacket packet = new DatagramPacket(bit, bit.length);
		System.out.println("Waiting for reception status ...");
		socket.receive(packet);
		int len = packet.getLength();
		String message = new String(bit, 0, len,"MS932");
		System.out.print("Received from " + packet.getAddress() + "\n"); 
		System.out.println(message);
		socket.close();
	}
}
