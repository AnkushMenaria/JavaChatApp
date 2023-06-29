import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Change the port number if needed
            System.out.println("Server started. Listening on port 12345...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println("Client: " + inputLine);

                System.out.print("You: ");
                String response = consoleReader.readLine();
                writer.println(response);
            }

            reader.close();
            writer.close();
            consoleReader.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
