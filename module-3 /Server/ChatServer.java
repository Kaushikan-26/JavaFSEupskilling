package Server;
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String clientMsg, serverMsg;

            while (true) {
                if (in.ready()) {
                    clientMsg = in.readLine();
                    if (clientMsg == null || clientMsg.equalsIgnoreCase("exit")) {
                        System.out.println("Client disconnected.");
                        break;
                    }
                    System.out.println("Client: " + clientMsg);
                }

                if (consoleInput.ready()) {
                    serverMsg = consoleInput.readLine();
                    out.println(serverMsg);
                    if (serverMsg.equalsIgnoreCase("exit")) {
                        System.out.println("Server closed the connection.");
                        break;
                    }
                }
            }

            clientSocket.close();
            System.out.println("Server stopped.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
