# Simple Chat App

This is a simple chat application implemented in Java using sockets. It allows for communication between a server and a client over a network.

## Features

- Server-client communication using sockets
- Bi-directional messaging between the server and client
- Graceful termination of the chat session

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) installed on your system
- Git installed on your system (optional)

### Installation

1. Clone the repository to your local machine using the following command:

   ```bash
   git clone https://github.com/your-username/simple-chat-app.git
Alternatively, you can download the repository as a ZIP file and extract it.

### Navigate to the project directory:

bash
Copy code
cd simple-chat-app
Compile the Java source files:

bash
Copy code
javac ChatServer.java
javac ChatClient.java
Usage
Start the server:

bash
Copy code
java ChatServer
The server will start listening for client connections on port 12345.

### Start the client:

bash
Copy code
java ChatClient
The client will connect to the server on the local machine and port 12345.

You can now start chatting between the server and the client. Type messages in the respective terminals and press Enter to send.

To end the chat session, either side can type "bye" as a message.

### Contributing
Contributions are welcome! If you would like to contribute to this project, please follow these steps:

Fork the repository
Create a new branch for your feature or bug fix
Make your changes and test thoroughly
Commit your changes with descriptive commit messages
Push your changes to your forked repository
Submit a pull request detailing your changes
License
This project is licensed under the MIT License.
