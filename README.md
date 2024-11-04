# ClientServerControl

## Overview
**ClientServerControl** is a Java-based remote control application that demonstrates client-server communication using socket programming. The application allows users to send commands from a client to a server, which executes the commands and returns the output in real-time, simulating a remote terminal environment.

## Features
- **Command Execution**: Users can input various system commands that are executed on the server.
- **Real-Time Responses**: The server processes commands and sends back the results immediately to the client.
- **Socket Programming**: Utilizes Java's networking capabilities to establish communication between the client and server.

## Used
- Java (JDK)
- Socket Programming

## How to Run
1. Clone the repository:
   -bash
   git clone https://github.com/yourusername/ClientServerControl.git
   cd ClientServerControl (Navigates to project directory)
   javac Server.java Client.java (Compiles the java files)
   java Server (Starts the server)
   java Client (In a new terminal, starts the client)
   
   ** Enter commands in the client terminal and view the results from the server.
## Usage

After starting both the server and client, you can enter any valid system commands in the client terminal. The server will execute these commands and return the output, simulating a terminal experience.

## Disclaimer

This project is for educational purposes only. It demonstrates fundamental networking concepts and should not be used for malicious intent.


   
