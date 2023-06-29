import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); 
            System.out.println("Connected to server.");

            // Input stream for receiving messages from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            // Output stream for sending messages to the server
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Input stream for reading messages from the console
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String inputLine;
            while (true) {
                System.out.print("You: ");
                String message = consoleReader.readLine();
                writer.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }

                inputLine = reader.readLine();
                System.out.println("Server: " + inputLine);
            }

            // Close streams and socket
            reader.close();
            writer.close();
            consoleReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
