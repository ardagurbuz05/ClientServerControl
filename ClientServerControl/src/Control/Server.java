package Control;

import java.io.*;
import java.net.*;

public class Server {
public static void main(String[] args) {
int port = 8000; 
try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Listening on port " + port + "...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

                String command;
while ((command = userInput.readLine()) != null) {
                    out.println(command);  // Send command to client
                    String response = in.readLine();  // Get response from client
                    System.out.println("Client: " + response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
