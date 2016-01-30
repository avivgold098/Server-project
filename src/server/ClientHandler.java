package server;

import java.io.InputStream;
import java.io.OutputStream;

import controller.Controller;
/**
 * ClientHandler interface - in this class we set the the methods of the client handling.
 * and make him functional
 */
public interface ClientHandler {
	/**
	 * in this method we handle the connection with our clients.
	 * @param inFromClient - the socket InputStream
	 * @param outToClient - the socket OutputStream
	 */
	void handleClient(InputStream inFromClient, OutputStream outToClient);
	
	/**
	 * set our controller that we are working with him.
	 * @param controller - the other controller that copied for our data member.
	 */
	void setController(Controller controller);
}