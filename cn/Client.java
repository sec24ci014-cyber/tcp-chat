package cn;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 5000);
        System.out.println("Connected");

        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String msg = "";

        while (!msg.equals("Over")) {
            msg = in.readLine();
            out.writeUTF(msg);
        }

        in.close();
        out.close();
        s.close();
    }
}
