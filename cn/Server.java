package cn;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started");
        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream in = new DataInputStream(s.getInputStream());
        String msg = "";

        while (!msg.equals("Over")) {
            msg = in.readUTF();
            System.out.println(msg);
        }

        s.close();
        ss.close();
    }
}
