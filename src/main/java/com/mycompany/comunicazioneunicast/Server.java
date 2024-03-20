
package com.mycompany.comunicazioneunicast;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


/**
 *
 * @author Kristian
 */
public class Server {
    
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int porta;
    

    public Server(int porta) {
        this.porta = porta;
        
        try {
            this.serverSocket = new ServerSocket(this.porta);
            System.out.println("Il server è in ascolto sulla porta: "+this.porta);
        } catch(BindException ex) {
            System.err.println("Porta già in uso");
        
        
        }
        
         catch (IOException ex) {
          System.err.println("Errore nella fase di connessione con il client");
          
        }
        
    }
    
    public Socket attendi() {
        if(serverSocket != null) {
        
            try {
                this.clientSocket = serverSocket.accept();
                System.out.println("Connessione effettuata");
            } catch(NullPointerException ex) {
                System.err.println(ex.getMessage());
            }
            catch(SocketException ex) {
                System.err.println(ex.getMessage());
            }
            catch(IOException ex) {
                System.err.println(ex.getMessage());
            }
        
        }
    
        return clientSocket;
    
    }
    
    public void scrivi() {
    
    
    }
    
    public void leggi() {
    
    }
    
    public void chiudi(){
    try{
        if(serverSocket != null) {
        this.clientSocket.close();
        System.out.println("Connessione chiusa con il client");
        }
    } catch (IOException ex) {
    System.err.println(ex.getMessage());
    }
   }
    
    public void termina() {
    try {
        if(serverSocket != null && clientSocket.isClosed()) {
             serverSocket.close();
        }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());     
         }
        }
    
    }
    
  
   
    
