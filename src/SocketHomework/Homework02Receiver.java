package SocketHomework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Homework02Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        String answer = "";
        if ("四大名著是那些".equals(s)) {
            answer = "四大名著。。。。。";
        } else {
            answer = "what?";
        }

        data = answer.getBytes();
        packet = new DatagramPacket(data,data.length, InetAddress.getLocalHost(),9998);
        socket.send(packet);

        socket.close();

    }
}
