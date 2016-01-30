package server;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import controller.Controller;
/**
 * 
 * In this class we have we shared all the common things to servers.
 *So here we the data membersa and the methods that should to be in every server in our project.
 *
 */
public abstract class CommonServer implements Server {
	/**
	 * with this controller we are working
	 */
	Controller controller;
	/**
	 * the port for connection
	 */
	int port;
	/**
	 * the server socket
	 */
	ServerSocket server;
	/**
	 * our client handler class
	 */
	ClientHandler clinetHandler;
	/**
	 * the num of clients we have
	 */
	int numOfClients;
	/**
	 * our thread magament
	 */
	ExecutorService threadpool;
	volatile boolean stop;	
	Thread mainServerThread;	
	int clientsHandled=0;
	
	/**
	 * CommonServer ctor in this ctor we are initialize our date members.
	 * @param port - the port of connection
	 * @param numOfClients - the number of clients.
	 */
	public CommonServer(int port, int numOfClients){
		this.port = port;
		this.numOfClients = numOfClients;
		
	}

	@Override
	public abstract void start();

	@Override
	public abstract void close();

	@Override
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public abstract void setMessage(String str);

	@Override
	public abstract boolean isAlive();

	@Override
	public abstract ArrayList<String> getIps();
}