package controller;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;
import model.Model;
import server.Server;

/**
 * this is the class of our project controller , so this class is specific one.
 * in this class we have all the implementation of the methods into the interface of controller.
 * in this class is passing the problems to the model and then waiting for sol from him and then
 * we are passing the soul to the view.
 * @author HP
 *
 */
public class MyController extends CommonController{
	/**
	 * MyController ctor - this ctor is calling to the super class ctor.
	 * initialize the model and view in the CommonController
	 * create the HashMap from String to Command
	 * @param model - the other model that copied for our model
	 * @param server - the other server that copied for our server
	 */
	
	public MyController(Model model, Server server) {
		super(model, server);
	}

	@Override
	public void setMessage(String message) {
		this.server.setMessage(message);

	}

	@Override
	public Maze3d getMaze(String parm) {
		Maze3d maze = model.generate3dMaze(parm);
		return maze;
	}

	@Override
	public Solution<Position> getSolution(String parm) {
		Solution<Position> solution = model.solve(parm);
		return solution;
	}
	@Override
	public void exit(){
		model.exit();
	}
	
	@Override
	public void close(){
		model.exit();
	}
	
	@Override
	public boolean pause(){
		return model.pause();
	}
	
	@Override
	public boolean resume(){
		return model.resume();
	}

	@Override
	public Solution<Position> getSolution(Maze3d maze) {
		Solution<Position> solution = model.solve(maze);
		return solution;
	}
}