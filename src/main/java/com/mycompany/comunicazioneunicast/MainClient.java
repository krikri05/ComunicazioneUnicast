
package com.mycompany.comunicazioneunicast;

/**
 *
 * @author Kristian
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Client client = new Client("Kri","Blu");
       client.connetti("127.0.0.1",1234);
       client.chiudi();
    }
    
}
