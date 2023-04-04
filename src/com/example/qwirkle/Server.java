package com.example.qwirkle;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        new Server();
    }

    private ServerSocket server;
    private int clientNum=0;

    public Server()throws Exception{
        server = new ServerSocket(5050);
        System.out.printf("Qwirkle server started on: %s:5050\n",
                InetAddress.getLocalHost().getHostAddress());

        // Create the initial group to which all clients belong.
        Games.addGroup("Qwirkle 1");

        while(true) {
            // Accept connection requests.
            Socket client = server.accept();
            System.out.printf("Connection request received: %s\n", client.getInetAddress().getHostAddress());

            // Increment number of clients encountered.
            clientNum++;

            // Create new client connection object to manage.
            Client qClient = new Client(client, clientNum);
        }
    }
}
