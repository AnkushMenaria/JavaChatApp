import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); 
            System.out.println("Server started. Listening on port 12345...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            // Input stream for receiving messages from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            // Output stream for sending messages to the client
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // Input stream for reading messages from the console
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println("Client: " + inputLine);

                System.out.print("You: ");
                String response = consoleReader.readLine();
                writer.println(response);
            }

            // Close streams and sockets
            reader.close();
            writer.close();
            consoleReader.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
