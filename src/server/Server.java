package server;

import java.util.ArrayList;

import controller.Controller;

/**
 * Its the Server interface the create his methods and make him functional.
 * 
 */
public interface Server {
	/**
	 * In this method we start our connection to the client by creating the socket 
	 * and this is super important method because here we have all work of the server 
	 * with the client
	 */
	void start();
	/**
	 * In this method we close our connection 
	 */
	void close();
	/**
	 * In this method we are setting our data member of controller with another one.
	 * @param controller - the other controller.
	 */
	void setController(Controller controller);
	/**
	 *in this method we manage status of our server 
	 * @param message the status of our server.
	 */
	void setMessage(String message);
	
	/**
	 * in this methos we are checking if the server is up or not.
	 * @return  true if the server is up otherwise false.
	 */
	boolean isAlive();
	
	/**
	 * In this method we return all the ips address that connected to the server.
	 * @return ArrayList of the ips that connect to the server.
	 */
	ArrayList<String> getIps();
}