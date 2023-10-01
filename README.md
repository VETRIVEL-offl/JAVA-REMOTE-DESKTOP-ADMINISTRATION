# REMOTE DESKTOP ADMINISTRATION USING JAVA

This program allows one computer to control another remotely. It provides features such as viewing the remote desktop, controlling mouse movement and buttons, and simulating keyboard input.

## Table of Contents

- [Features](#features)
- [Background](#background)
- [Program Parts](#program-parts)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Coding Structure](#coding-structure)


## Features

- View remote desktop
- Control mouse movement and buttons
- Simulate keyboard input

## Background

One of the biggest challenges in this project was finding a way to move the mouse pointer, simulate keystrokes, and capture the screen. We solved this problem by using the `Robot` class, which provides the necessary functionality.

Additionally, we used serialization to send screenshots from the client to the server and to send server events like mouse moves, key presses, and key releases. This approach simplified the code and improved network communication.

## Program Parts

### RemoteServer

- **ServerInitiator Class**: Listens for client connections and creates the program's GUI.
- **ClientHandler Class**: Manages each connected client, displaying an InternalFrame for each and receiving client screen dimensions.
- **ClientScreenReciever Class**: Receives captured screens from clients and displays them.
- **ClientCommandsSender Class**: Listens for server commands and sends them to clients (e.g., mouse moves, key presses).
- **EnumCommands Class**: Defines constants for server commands.

### RemoteClient

- **ClientInitiator Class**: The entry point that establishes a connection to the server and creates the client GUI.
- **ScreenSpyer Class**: Captures the screen periodically and sends it to the server.
- **ServerDelegate Class**: Receives server commands and executes them on the client.
- **EnumCommands Class**: Defines constants for server commands.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Two computers, one to run the server and another to run the client

### Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/remote-computer-control.git

  Using the Code 
In order to run the program, you need to download RemoteServer_source.zip and RemoteClient_source.zip on two different PCs, then extract them. In one of the PCs say PC1, run RemoteServer.jar which is located under dist folder using the following command: 

>> java -jar  RemoteServer.jar 
You will be asked to enter port number for the server to listen at, enter any port number above 1024, for example 5000.   

On the other PC say PC2, execute RemoteClient.jar using the following command:  

>> java -jar RemoteClient.jar  
You will be asked to enter server IP, enter IP address of PC1, then you will be asked to enter port number, enter the same port you entered above, e.g. 5000. 

Now, in PC1 you have full control over PC2 including moving the mouse, clicking the mouse, keys stroking, viewing PC2 desktop, etc.  

### Coding Structure    
### RemoteServer
## ServerInitiator  Class
This is the entry class which listens to server port and wait for clients connections. Also, it creates an essential part of the program GUI.

## ClientHandler Class 
Per each connected client, there is an object of this class. It shows an InternalFrame per client and it receives clients' screen dimension.

## ClientScreenReciever Class 
Receives captured screen from the client, then displays it.

## ClientCommandsSender Class
It listens to the server commands, then sends them to the client. Server commands include mouse move, key stroke, mouse click, etc.

## EnumCommands Class
Defines constants which are used to represent server commands.

## RemoteClient   
ClientInitiator Class 
This is the entry class that starts the client instance. It establishes connection to the server and creates the client GUI.

##  ScreenSpyer Class  
Captures screen periodically and sends them to the server.

## ServerDelegate Class   
Receives server commands and executes them in the client PC.

## EnumCommands Class  
Defines constants which are used to represent server commands.   

### ❤🧡💛💚💙💜🤎🖤🤍



