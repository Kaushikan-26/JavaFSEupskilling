package Server;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String serverMsg, clientMsg;

            while (true) {
                if (in.ready()) {
                    serverMsg = in.readLine();
                    if (serverMsg == null || serverMsg.equalsIgnoreCase("exit")) {
                        System.out.println("Server closed the connection.");
                        break;
                    }
                    System.out.println("Server: " + serverMsg);
                }

                if (consoleInput.ready()) {
                    clientMsg = consoleInput.readLine();
                    out.println(clientMsg);
                    if (clientMsg.equalsIgnoreCase("exit")) {
                        System.out.println("Client closed the connection.");
                        break;
                    }
                }
            }

            socket.close();
            System.out.println("Client stopped.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

