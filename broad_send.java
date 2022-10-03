import java.net.*;
import java.io.*;
public class broad_send {
	public static void main(String[] args) throws Exception {
		BufferedReader character = new BufferedReader(new InputStreamReader(System.in));
		InetAddress intf = InetAddress.getByName("255.255.255.255");
		int port = 8888;
		DatagramSocket socket = new DatagramSocket();
		System.out.print("Please type and enter\n");
		String message = character.readLine();
		byte[] bit = message.getBytes("MS932");
		DatagramPacket packet;
		packet = new DatagramPacket(bit, bit.length, intf, port);
		socket.send(packet);
		socket.close();
	}
}