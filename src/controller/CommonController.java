package controller;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import model.Model;
import server.Server;

/**
 * this class is shared all the common things to the controller.
 * so in this class we data members of model and server(view), this class is implemnents the server
 * inter face.
 * @author HP
 *
 */
public abstract class CommonController implements Controller{
	
	/**
	 * the model we  are working with him
	 */
	Model model;
	/**
	 * the server we are working with him
	 */
	Server server;
	
	/**
	 * the ctor of our class- initialize the both data members
	 * @param model - the other model that copied for our model
	 * @param server - the other server that copied for our server
	 */
	public CommonController(Model model, Server server){
		this.model = model;
		this.server = server;
	}
	
	@Override
	public Model getModel() { return model; }
	
	@Override
	public Server getServer() {return server; }
	
	@Override
	public abstract void setMessage(String massage);
	
	@Override
	public abstract Maze3d getMaze(String parm);
	
	@Override
	public abstract Solution<Position> getSolution(String parm);

	@Override 
	public abstract Solution<Position> getSolution(Maze3d maze);
	@Override
	public abstract void exit();

	@Override
	public abstract boolean pause();
	
	@Override
	public abstract boolean resume();
}