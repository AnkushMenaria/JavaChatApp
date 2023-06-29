import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Change the hostname and port number if needed
            System.out.println("Connected to server.");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

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

            reader.close();
            writer.close();
            consoleReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
