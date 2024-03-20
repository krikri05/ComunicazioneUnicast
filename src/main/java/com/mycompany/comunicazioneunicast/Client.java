
package com.mycompany.comunicazioneunicast;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 *
 * @author Kristian
 */
public class Client {
    private String nome;
    private String colore;
    private Socket socket;

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }
    
    public void connetti(String nomeServer, int portaServer) {
        try {
            System.out.println("Client " + nome + " in esecuzione ");
            this.socket = new Socket(nomeServer, portaServer);
            System.out.println("Connessione avvenuta con il server :"+ nomeServer);
        } catch (ConnectException ex) {
           //server non in ascolto
    System.err.println(ex.getMessage());
    } catch (UnknownHostException ex) {
        //host sconosciuto
    System.err.println(ex.getMessage());
    } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    
    }
    
    public void scrivi() {
    
    
    }
    
    public void leggi() {
    
    }
            
    public void chiudi() {
    try {
    if(socket != null) {
    socket.close();
    System.out.println("Connessione chiusa con il server");
    }
    } catch (IOException ex) {
     System.err.println(ex.getMessage());
    
    }
    
    
    }
}
