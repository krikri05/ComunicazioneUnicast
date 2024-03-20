
package com.mycompany.comunicazioneunicast;

/**
 *
 * @author Kristian
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server server= new Server(1234);
        server.attendi();
        server.chiudi();
    }
    
}
